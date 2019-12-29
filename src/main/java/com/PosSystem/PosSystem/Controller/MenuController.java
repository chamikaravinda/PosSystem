package com.PosSystem.PosSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("menu")
public class MenuController {

    @GetMapping("loadHome")
    public ModelAndView loadHome(){
        System.out.println("MenuController => loadHome");
        ModelAndView modelAndView = new ModelAndView();
        try{
            modelAndView.setViewName("home");
            modelAndView.addObject("appName", "POS System");
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        return modelAndView;
    }

    @GetMapping("loadMaterial")
    public String loadMaterial(){
        System.out.println("MenuController => loadMaterial");
        String view;
        try{
            view = "material/view-search-material";
        }
        catch (Exception e){
            System.out.println("Error: " + e);
            view = "";
        }
        return view;
    }

}
