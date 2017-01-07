package club.iwalker.basic.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangchen on 2017/1/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        AnnotationService annotationService = context.getBean(AnnotationService.class);

        MethodService methodService = context.getBean(MethodService.class);

        annotationService.add();

        methodService.add();

        context.close();
    }
}
