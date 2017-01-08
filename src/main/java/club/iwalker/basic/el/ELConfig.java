package club.iwalker.basic.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.nio.charset.Charset;

@Configuration
@ComponentScan("club.iwalker.basic.el")
@PropertySource("classpath:club/iwalker/basic/el/el.properties")//7
public class ELConfig {
	
	@Value("I Love You!") //1
    private String normal;

	@Value("#{systemProperties['os.name']}") //2
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }") //3
    private double randomNumber;

	@Value("#{beanService.beanInfo}") //4
	private String fromBeanInfo;

	@Value("classpath:club/iwalker/basic/el/el.txt") //5
	private Resource elFile;

	@Value("http://www.google.com") //6
	private Resource webUrl;

	@Value("${iwalker.info}") //7
	private String iwalkerInfo;

	@Autowired
	private Environment environment; //7
	
	@Bean //7
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	


	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromBeanInfo);
			System.out.println(IOUtils.toString(elFile.getInputStream(), Charset.defaultCharset()));
			System.out.println(IOUtils.toString(webUrl.getInputStream(), Charset.defaultCharset()));
			System.out.println(iwalkerInfo);
			System.out.println(environment.getProperty("iwalker.name"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
