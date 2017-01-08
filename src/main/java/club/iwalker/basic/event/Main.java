package club.iwalker.basic.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {

	public static void main(String[] args) {
		 AnnotationConfigApplicationContext context =
	                new AnnotationConfigApplicationContext(EventConfig.class);
		 
		 MsgPublisher msgPublisher = context.getBean(MsgPublisher.class);

		msgPublisher.publish("hello application event");
		 
		 context.close();
	}
}
