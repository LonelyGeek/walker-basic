package club.iwalker.basic.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("club.iwalker.basic.scheduled")
@EnableScheduling //1
public class TaskSchedulerConfig {

}
