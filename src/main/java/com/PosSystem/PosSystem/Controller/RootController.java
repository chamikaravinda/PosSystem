package com.PosSystem.PosSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RootController {

//    @RequestMapping("/")
//    @ResponseBody
//    public String test(){
//        System.out.println("Root controller...");
//        return "Hello World";
//    }

    @RequestMapping("/")
    public String root(){
        System.out.println("Root controller... Default page");
        return "Login/login";
    }

}
