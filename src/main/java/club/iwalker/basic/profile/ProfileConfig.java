package club.iwalker.basic.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev") //1
	public ProfileBean devDemoBean() {
		return new ProfileBean("from development profile");
	}

	@Bean
	@Profile("prod") //2
	public ProfileBean prodDemoBean() {
		return new ProfileBean("from production profile");
	}

}
