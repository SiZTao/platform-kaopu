package com.platform.service;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2016年12月19日 下午3:33:38
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    /**
     * 生成代码
     */
    byte[] generatorCode(String[] tableNames);
}
