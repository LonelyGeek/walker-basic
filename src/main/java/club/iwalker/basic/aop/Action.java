package club.iwalker.basic.aop;

import java.lang.annotation.*;

/**
 * Created by wangchen on 2017/1/8.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
