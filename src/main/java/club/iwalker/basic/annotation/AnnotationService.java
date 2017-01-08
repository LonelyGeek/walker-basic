package club.iwalker.basic.annotation;

import org.springframework.stereotype.Service;

@Service
public class AnnotationService {
	
	public void outputResult(){
		System.out.println("从组合注解配置照样获得的 bean");
	}

}
