package com.frame.xwz.source.auto;

import java.lang.annotation.*;

/**
 * @author xuweizhi
 * @date 2019/04/14 0:30
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@MyComponent
public @interface MyController {

    String alias() default "";
}
