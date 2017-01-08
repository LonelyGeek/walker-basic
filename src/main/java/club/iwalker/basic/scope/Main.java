package club.iwalker.basic.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangchen on 2017/1/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);

        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);

        System.out.println("s1 与 s2 是否相等：" + (s1 == s2));
        System.out.println("p1 与 p2 是否相等：" + (p1 == p2));
    }
}
