package com.PosSystem.PosSystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {

    @GetMapping("loadTest")
    public ModelAndView loadTest(){
        System.out.println("TestController => loadTest");
        ModelAndView modelAndView = new ModelAndView();
        try{
            modelAndView.setViewName("test");
            modelAndView.addObject("appName", "POS System");
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
        return modelAndView;
    }

}
