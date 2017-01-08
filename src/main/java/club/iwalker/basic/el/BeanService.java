package club.iwalker.basic.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BeanService {

	@Value("其他类的属性")
	private String beanInfo;

	public String getBeanInfo() {
		return beanInfo;
	}

	public void setBeanInfo(String beanInfo) {
		this.beanInfo = beanInfo;
	}
}
