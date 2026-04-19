package com.zaurtregulov.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MyController {

    @GetMapping("")
    public String getInfoAllEmps(){
        return "view-for-all-employees";
    }

    @GetMapping("/hr_info")
    public String getInfoOnlyForHR(){
        return "view-for-hr";
    }

    @GetMapping("/manager_info")
    public String getInfoOnlyForManagers(){
        return "view-for-managers";
    }
}
