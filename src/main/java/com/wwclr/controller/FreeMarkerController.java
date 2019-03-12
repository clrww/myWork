package com.wwclr.controller;

import com.wwclr.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwclr on 2019/3/11.
 */
@Controller
@RequestMapping("/ftl")
public class FreeMarkerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("resource",resource);
        return "index";
    }
    @RequestMapping("/center")
    public String center(){
        return  "center/center";
    }
}
