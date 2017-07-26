package com;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginInfo {
    // inject via application.properties

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "welcome";
    }

    @RequestMapping("/login/validate")
    public Boolean validateLogin(HttpServletRequest request) {
        Boolean result = false;
        String loginName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Login Details are ::" + loginName + "::" + password);
        if (!loginName.isEmpty() && loginName != null && !password.isEmpty() && password != null) {

        }
        else {
            result = false;
        }
        return result;
    }
}
