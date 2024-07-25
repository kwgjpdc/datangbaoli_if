package com.bywin.baoli.aspect;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {
    /**
     * 描述
     *
     * @return
     */
    String description() default "";

    /**
     * 请求的url
     *
     * @return
     */
    String urlPath() default "";

}