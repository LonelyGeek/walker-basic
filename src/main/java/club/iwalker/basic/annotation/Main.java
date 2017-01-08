package club.iwalker.basic.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);
		
		AnnotationService annotationService =  context.getBean(AnnotationService.class);

		annotationService.outputResult();
		
		context.close();
	}

}
