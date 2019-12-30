package com.PosSystem.PosSystem.Controller;

import com.PosSystem.PosSystem.Dao.MaterialDao;
import com.PosSystem.PosSystem.Model.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("material")
public class MaterialController {

    @Autowired
    MaterialDao materialDao;

    @GetMapping("loadMaterialList")
    public ModelAndView loadMaterialList(){
        System.out.println("MaterialController => loadMaterialList");
        ModelAndView modelAndView = new ModelAndView("material/view-materials");
        try{
            List<Material> materialList = (List<Material>) materialDao.findAll();
            modelAndView.addObject("materialList", materialList);
            modelAndView.addObject("status", 1);
        }
        catch(Exception e){
            modelAndView.addObject("status", 0);
            System.out.println("Error: " + e);
        }
        return modelAndView;
    }

//    @RequestMapping("get_materials")
//    public ModelAndView get_materials(){
//        System.out.println("MaterialController => get_materials");
//
//        ModelAndView modelAndView = new ModelAndView();
//        List<Material> materialList = (List<Material>) materialDao.findAll();
//        modelAndView.addObject("materialList", materialList);
//        modelAndView.setViewName("view-material");
//
//        return modelAndView;
//    }
//
//    @RequestMapping("get_material_by_name")
//    public ModelAndView get_material_by_name(@RequestParam("name") String name){
//        System.out.println("MaterialController => get_material_by_name");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("view-material");
//        try{
//            Material material = (Material) materialDao.findByName(name);
//            if(material == null){
//                System.out.println("Empty");
//                modelAndView.addObject("status", "empty");
//            }
//            else{
//                System.out.println("Not empty");
//                modelAndView.addObject("status", "packed");
//            }
//            modelAndView.addObject("material", material);
//        }
//        catch (NullPointerException e){
//            System.out.println("Error: " + e);
//            modelAndView.addObject("status", "empty");
//        }
//        catch (Exception e){
//            System.out.println("Error: " + e);
//            modelAndView.addObject("status", "un-known error");
//        }
//        return modelAndView;
//    }
//
//    @RequestMapping("get_material_by_name_and_status")
//    public ModelAndView get_material_by_name_and_status(@RequestParam("name") String name, @RequestParam("id") int id){
//        System.out.println("MaterialController => get_material_by_name_and_status");
//
//        ModelAndView modelAndView = new ModelAndView();
//        Material material = (Material) materialDao.findByNameAndStatus(name, id);
//        modelAndView.addObject("material", material);
//        modelAndView.setViewName("view-material");
//
//        return modelAndView;
//    }
//
//    @RequestMapping("getMaterialslikeName")
//    public ModelAndView getMaterialslikeName(@RequestParam("name") String name){
//        System.out.println("MaterialController => getMaterialslikeName");
//
//        ModelAndView modelAndView = new ModelAndView();
//        List<Material> materialList = (List<Material>) materialDao.findByNameContaining(name);
//        modelAndView.addObject("materialList", materialList);
//        modelAndView.setViewName("view-material");
//
//        return modelAndView;
//    }

}
