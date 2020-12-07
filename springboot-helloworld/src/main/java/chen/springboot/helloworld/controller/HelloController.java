package chen.springboot.helloworld.controller;

import chen.springboot.helloworld.config.AccountConfig;
import chen.springboot.helloworld.config.FoodConfig;
import chen.springboot.helloworld.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private AccountConfig accountConfig;
    @Autowired
    private FoodConfig foodConfig;

    @Value("${rootAccount.username}")
    private String username;
    @Value("${rootAccount.password}")
    private String password;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot !!";
    }

    @RequestMapping("/food")
    public FoodConfig food() {
        return foodConfig;
    }

    @RequestMapping("/account")
    public Account account() {
        return new Account(accountConfig.getUsername(),accountConfig.getPassword());
    }

    @RequestMapping("/jasypt")
    public String jasypt() {
        return "加密用户名："+username+"<br>加密密码："+password;
    }
}
