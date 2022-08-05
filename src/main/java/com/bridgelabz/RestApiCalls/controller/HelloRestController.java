package com.bridgelabz.RestApiCalls.controller;

import com.bridgelabz.RestApiCalls.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/hello"})
public class HelloRestController {
    @RequestMapping(value = {"/home"})
    public String sayHello(){
        return "Hello From Bridgelabz";
    }
   @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String query(@RequestParam(value = "name") String name){
        return "Hello" + name + "!";
    }
}
