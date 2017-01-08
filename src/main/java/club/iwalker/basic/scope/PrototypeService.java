package club.iwalker.basic.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by wangchen on 2017/1/8.
 */
@Service
@Scope("prototype")
public class PrototypeService {

}
