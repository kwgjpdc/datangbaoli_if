package com.bywin.baoli.common.res;
 
import java.lang.annotation.*;

/**
 * 
 * @author 
 * 自定义放行Release注解，添加该注解放回值不包装
 *
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ResponseResult {
 
}