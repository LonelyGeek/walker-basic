package club.iwalker.basic.di;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller //1
public class FunctionController {
	@Resource //2
	FunctionService functionService;
	
	public String SayHello(String word){
		return functionService.sayHello(word);
	}

}
