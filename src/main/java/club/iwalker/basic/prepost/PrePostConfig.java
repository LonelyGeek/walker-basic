package club.iwalker.basic.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("club.iwalker.basic.prepost")
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="destroy") //1
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	AnnotationWayService jsr250WayService(){
		return new AnnotationWayService();
	}

}
