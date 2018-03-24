package com.platform.service;

import com.platform.dao.ApiCartMapper;
import com.platform.dao.ApiGoodsCrashMapper;
import com.platform.entity.CartVo;
import com.platform.entity.GoodsCrashVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ApiCartService {
    @Autowired
    private ApiCartMapper cartDao;
    @Autowired
    private ApiGoodsCrashMapper apiGoodsCrashMapper;

    public CartVo queryObject(Integer id) {
        return cartDao.queryObject(id);
    }


    public List<CartVo> queryList(Map<String, Object> map) {
        return cartDao.queryList(map);
    }


    public int queryTotal(Map<String, Object> map) {
        return cartDao.queryTotal(map);
    }


    public void save(CartVo cart) {
        cartDao.save(cart);
        // 更新购物车搭配减价
        // 判断购物车中是否存在此规格商品
        Map cartParam = new HashMap();
        cartParam.put("user_id", cart.getUser_id());
        List<CartVo> cartInfoList = cartDao.queryList(cartParam);
        // 是否有搭配减价
        Map crashParam = new HashMap();
        List<Integer> goods_ids = new ArrayList();
        List<CartVo> cartUpdateList = new ArrayList();
        for (CartVo cartItem : cartInfoList) {
            if (null != cartItem.getChecked() && 1 == cartItem.getChecked()) {
                goods_ids.add(cartItem.getGoods_id());
            }
            if (!cartItem.getRetail_price().equals(cartItem.getRetail_product_price())) {
                cartItem.setRetail_price(cartItem.getRetail_product_price());
                cartUpdateList.add(cartItem);
            }
        }
        crashParam.put("goods_ids", goods_ids);
        List<GoodsCrashVo> goodsCrashList = apiGoodsCrashMapper.queryList(crashParam);
        if (null != goodsCrashList) {
            for (GoodsCrashVo crashVo : goodsCrashList) {
                for (CartVo cartItem : cartInfoList) {
                    // 存在原始的
                    if (null != cartItem.getChecked() && 1 == cartItem.getChecked()
                            && cartItem.getGoods_id().equals(crashVo.getGoods_id())) {
                        for (CartVo cartCrash : cartInfoList) { // 搭配上了商品
                            if (!cartCrash.getId().equals(cartItem.getId())
                                    && cartCrash.getGoods_id().equals(crashVo.getGoods_crash_id())
                                    && cartCrash.getProduct_id().equals(crashVo.getProduct_crash_id())) {
                                cartItem.setRetail_price(crashVo.getRetail_crash_price());
                                cartUpdateList.add(cartItem);
                            }
                        }
                    }
                }
            }
        }
        if (null != cartUpdateList && cartUpdateList.size() > 0) {
            for (CartVo cartItem : cartUpdateList) {
                cartDao.update(cartItem);
            }
        }
    }

    public void update(CartVo cart) {
        cartDao.update(cart);
    }


    public void delete(Integer id) {
        cartDao.delete(id);
    }


    public void deleteBatch(Integer[] ids) {
        cartDao.deleteBatch(ids);
    }

    public void updateCheck(String[] productIds, Integer isChecked, Long userId) {
        cartDao.updateCheck(productIds, isChecked, userId);

        // 判断购物车中是否存在此规格商品
        Map cartParam = new HashMap();
        cartParam.put("user_id", userId);
        List<CartVo> cartInfoList = cartDao.queryList(cartParam);
        // 是否有搭配减价
        Map crashParam = new HashMap();
        List<Integer> goods_ids = new ArrayList();
        List<CartVo> cartUpdateList = new ArrayList();
        for (CartVo cartItem : cartInfoList) {
            if (null != cartItem.getChecked() && 1 == cartItem.getChecked()) {
                goods_ids.add(cartItem.getGoods_id());
            }
            if (!cartItem.getRetail_price().equals(cartItem.getRetail_product_price())) {
                cartItem.setRetail_price(cartItem.getRetail_product_price());
                cartUpdateList.add(cartItem);
            }
        }
        if (null != goods_ids && goods_ids.size() > 0) {
            crashParam.put("goods_ids", goods_ids);
            List<GoodsCrashVo> goodsCrashList = apiGoodsCrashMapper.queryList(crashParam);
            if (null != goodsCrashList) {
                for (GoodsCrashVo crashVo : goodsCrashList) {
                    for (CartVo cartItem : cartInfoList) {
                        // 存在原始的
                        if (null != cartItem.getChecked() && 1 == cartItem.getChecked()
                                && cartItem.getGoods_id().equals(crashVo.getGoods_id())) {
                            for (CartVo cartCrash : cartInfoList) { // 搭配上了商品
                                if (null != cartItem.getChecked() && 1 == cartItem.getChecked() &&
                                        !cartCrash.getId().equals(cartItem.getId())
                                        && cartCrash.getGoods_id().equals(crashVo.getGoods_crash_id())
                                        && cartCrash.getProduct_id().equals(crashVo.getProduct_crash_id())) {
                                    cartCrash.setRetail_price(crashVo.getRetail_crash_price());
                                    cartUpdateList.add(cartCrash);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (null != cartUpdateList && cartUpdateList.size() > 0) {
            for (CartVo cartItem : cartUpdateList) {
                cartDao.update(cartItem);
            }
        }
    }

    public void deleteByProductIds(String[] productIds) {
        cartDao.deleteByProductIds(productIds);
    }

    public void deleteByUserAndProductIds(Long userId, String[] productIds) {
        cartDao.deleteByUserAndProductIds(userId,productIds);
    }

    public void deleteByCart(Long user_id, Integer session_id, Integer checked) {
        cartDao.deleteByCart(user_id, session_id, checked);
    }

}
