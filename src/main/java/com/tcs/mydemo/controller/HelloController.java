package com.tcs.mydemo.controller;

import com.tcs.mydemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {


@RequestMapping("/")
    public String hello()
    {
        return "hello worldsss!";
    }

    @GetMapping("/hello/{name}")
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public User hellouser(@PathVariable  String name)
    {

        return new User(name,"1","grutkars@gmail.com");
    }

}
