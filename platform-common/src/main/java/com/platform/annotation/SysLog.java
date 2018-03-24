package com.platform.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 * @author 黑龙江省靠谱科技有限公司
 * @email 
 * @date 2017年3月8日 上午10:19:56
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "操作日志";
}
