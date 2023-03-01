package com.ltp.speed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Speed {
    @RequestMapping("/")
    public String Show(Model model){
model.addAttribute("speed",85);
        return "sign";
    }
}
