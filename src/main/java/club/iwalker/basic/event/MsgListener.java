package club.iwalker.basic.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MsgListener implements ApplicationListener<MsgEvent> {

	public void onApplicationEvent(MsgEvent event) {
		
		String msg = event.getMsg();
		
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"
				+ msg);

	}

}
