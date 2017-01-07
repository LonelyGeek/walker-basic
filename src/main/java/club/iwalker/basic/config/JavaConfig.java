package club.iwalker.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public FunctionController functionController() {
        FunctionController functionController = new FunctionController();
        functionController.setFunctionService(functionService());
        return functionController;
    }

    /*@Bean
    public FunctionController functionController(FunctionService functionService) {
        FunctionController functionController = new FunctionController();
        functionController.setFunctionService(functionService);
        return functionController;
    }*/
}
