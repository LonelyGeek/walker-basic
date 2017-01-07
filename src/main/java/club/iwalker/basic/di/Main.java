package club.iwalker.basic.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(DIConfig.class); //1
		 
		 FunctionController useFunctionService = context.getBean(FunctionController.class); //2
		 
		 System.out.println(useFunctionService.SayHello("world"));
		 
		 context.close();
	}
}
