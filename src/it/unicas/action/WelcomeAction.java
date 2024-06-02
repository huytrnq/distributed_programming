package it.unicas.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class WelcomeAction extends ActionSupport implements SessionAware {
    private Map<String, Object> session;

    @Override
    public String execute() {
        String username = (String) session.get("username");
        if (username == null) {
            return LOGIN;
        } else {
            System.out.println("============ Welcome to the application ============");
            return SUCCESS;
        }
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
