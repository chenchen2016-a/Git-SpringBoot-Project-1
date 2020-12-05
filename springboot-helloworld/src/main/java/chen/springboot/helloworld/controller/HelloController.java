package chen.springboot.helloworld.controller;

import chen.springboot.helloworld.config.AccountConfig;
import chen.springboot.helloworld.config.FoodConfig;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot !!";
    }

    @RequestMapping("/food")
    public FoodConfig food() {
        return foodConfig;
    }

    @RequestMapping("/account")
    public AccountConfig account() {
        return accountConfig;
    }
}
