package club.iwalker.basic.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				  new AnnotationConfigApplicationContext();

		//通过Environment 配置，还可以通过 jvm的spring.profiles.active和Servlet的context parameter配置
		context.getEnvironment().setActiveProfiles("prod"); //1
		context.register(ProfileConfig.class);//2
		context.refresh(); //3
		  
		ProfileBean profileBean = context.getBean(ProfileBean.class);
	      
		System.out.println(profileBean.getContent());
	      
		context.close();
	}
}
