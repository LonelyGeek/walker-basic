package club.iwalker.basic.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wangchen on 2017/1/8.
 */
@Configuration
@ComponentScan("club.iwalker.basic.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
