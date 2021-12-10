package com.demo.CICD.Controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/home")
public class MainController {
    private static String userName = "Thor - the fake";

    @GetMapping("/test")
    public String testApi(){
        return "Hooray, Your application server is running...";
    }

    @GetMapping("/getName")
    public String getYourName(){
        return userName;
    }

    @GetMapping("/postName")
    public String tellMeYourName(@RequestParam(required = true, name = "name") String name){
        userName = name;

        return "Name changed to "+ userName;
    }

}

