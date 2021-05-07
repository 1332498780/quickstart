package cn.hzy.demo.controller;

import cn.hzy.demo.model.DDept;
import cn.hzy.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class MyController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private DeptService deptService;

    @GetMapping("/test")
    public String test(){
        String name = messageSource.getMessage("name",null, Locale.getDefault());
        String greet = messageSource.getMessage("greetMsg",new Object[]{"黄柱云"},Locale.getDefault());
        return "name:"+name+",greet:"+greet;
    }

    @GetMapping("/insert")
    public String insert(){
        deptService.insert();
        return "insert";
    }

    @GetMapping("/result")
    public String result(){
        return deptService.findAll();
    }
}
