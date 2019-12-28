package com.PosSystem.PosSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("menu")
public class MenuController {

    @GetMapping("loadHome")
    public String loadHome(){
        try{
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("appName", "Maruthi Printers");
            System.out.println("MenuController => loadHome");
            return "home";
        }
        catch (Exception e){
            System.out.println("Error: " + e);
            return "";
        }
    }

}
