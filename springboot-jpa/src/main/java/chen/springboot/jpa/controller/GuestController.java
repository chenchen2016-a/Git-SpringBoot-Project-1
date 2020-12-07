package chen.springboot.jpa.controller;


import chen.springboot.jpa.domain.Guest;
import chen.springboot.jpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuestController {
    @Autowired
    private GuestService service;

    @RequestMapping("/restaurant/list")
    public String guestView(Model model) {
        model.addAttribute("guestList",service.guestList());
        return "list";
    }
}
