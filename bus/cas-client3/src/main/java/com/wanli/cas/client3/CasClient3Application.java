package com.wanli.cas.client3;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
@EnableCasClient
public class CasClient3Application {

    @RequestMapping("/")
    public String home(HttpServletRequest request) {
        //获取cas给我们传递回来的对象，这个东西放到了session中
        //session的 key是 _const_cas_assertion_
        Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        //获取登录用户名
        String loginName = assertion.getPrincipal().getName();
        System.out.printf("返回值:%s\r\n", assertion.getPrincipal().getAttributes());
        System.out.printf("登录用户名:%s\r\n", loginName);
        return "Hello cas客户端3" + loginName;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CasClient3Application.class, args); }
}
