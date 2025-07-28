package com.tcs.mydemo.controller;

import com.tcs.mydemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {


@RequestMapping("/")
    public String hello()
    {
        return "hello worldsss!";
    }

    @GetMapping("/hello")
    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public User hellouser()
    {

        return new User("utkarsh","1","grutkars@gmail.com");
    }

}
