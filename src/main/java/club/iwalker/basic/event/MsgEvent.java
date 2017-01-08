package club.iwalker.basic.event;

import org.springframework.context.ApplicationEvent;

public class MsgEvent extends ApplicationEvent{
    private String msg;

    public MsgEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
