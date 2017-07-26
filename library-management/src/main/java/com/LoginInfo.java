package com;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginInfo {
    // inject via application.properties

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        return "welcome";
    }

    @RequestMapping(value = "/login/validate", method = RequestMethod.GET)
    @ResponseBody
    public String validateLogin(HttpServletRequest request) {
        Boolean result = false;
        String loginName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("Login Details are ::" + loginName + "::" + password);

        return "SUCCESS";
    }
}
