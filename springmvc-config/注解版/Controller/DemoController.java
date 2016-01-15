package com.jkguo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/1/13.
 */

@Controller
public class DemoController {

    @RequestMapping(value = "/",method = RequestMethod.GET )
    public String  index( ModelMap modelMap){
        modelMap.put("message","Hello World!");
        return "index";
    }
}
