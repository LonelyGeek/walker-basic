package club.iwalker.basic.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class); //1

        FunctionController useFunctionService = context.getBean(FunctionController.class); //2

        System.out.println(useFunctionService.SayHello("walker"));

        context.close();
    }
}
