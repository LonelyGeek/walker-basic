package club.iwalker.basic.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		AnnotationWayService annotationWayService = context.getBean(AnnotationWayService.class);
		
		context.close();
	}

}
