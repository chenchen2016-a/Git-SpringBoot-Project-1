package chen.springboot.restaurant.controller;

import chen.springboot.restaurant.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {
    @Autowired
    private GuestService service;

    @RequestMapping("/guestView")
    public String guestView(Model model) {
        model.addAttribute("guestList",service.guestList());
        return "list";
    }
}
