package com.security.check;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/index", "/home"})
    public String index(){
        return "index";
    }

    @RequestMapping("closed")
    public String closed(){
        return "closed";
    }
}
