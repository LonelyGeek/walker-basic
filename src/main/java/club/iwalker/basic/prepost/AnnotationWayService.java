package club.iwalker.basic.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationWayService {

	@PostConstruct //1
	public void init(){
		System.out.println("Annotation-init-method");
	}
	public AnnotationWayService() {
		super();
		System.out.println("初始化构造函数-AnnotationWayService");
	}
	@PreDestroy //2
	public void destroy(){
		System.out.println("Annotation-destory-method");
	}
}
