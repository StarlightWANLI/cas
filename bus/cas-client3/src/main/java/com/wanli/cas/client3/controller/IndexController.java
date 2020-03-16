package com.wanli.cas.client3.controller;

import org.jasig.cas.client.util.AbstractCasFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Anumbrella
 */
@Controller
public class IndexController {

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        // return "redirect:https://sso.anumbrella.net:8443/cas/logout?service=https://client.anumbrella.net:9443/";
        return "redirect:https://sso.anumbrella.net:8443/cas/logout?service=http://localhost:8090/";
    }
}
