package club.iwalker.basic.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{//1
	
	private String beanName;
	private ResourceLoader resourceLoader;
	
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {//2
		this.resourceLoader = resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {//3
		this.beanName = beanName;
	}
	
	public void outputResult(){
		System.out.println("Bean的名称为：" + beanName);
		
		Resource resource = resourceLoader.getResource("classpath:aware.txt");
		try{
			
			System.out.println("ResourceLoader 加载的文件内容为Ϊ: " + IOUtils.toString(resource.getInputStream(), Charset.defaultCharset()));
			
		   }catch(IOException e){
			e.printStackTrace();
		   }
	
	}

}
