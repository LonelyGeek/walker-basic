package club.iwalker.basic.aop;

import org.springframework.stereotype.Service;

/**
 * Created by wangchen on 2017/1/8.
 */
@Service
public class AnnotationService {

    @Action(name = "注解式拦截的操作")
    public void add() {

    }
}
