package chen.springboot.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class TimeController {
    @RequestMapping("/time")
    public String time(Model model) {
        model.addAttribute("now",new Date().toString());
        return "time";
    }
}
