package com.example.ProductServiceAug24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    //End point name:GET /hello
    @GetMapping("/hello")
    public String helloworld(){
        return "Hello World";
    }
    //Endpoint with name: GET /hello/{name}
    @GetMapping("/hello/{name}")
    public String hellowithname(@PathVariable("name") String name){
        return "Hello "+name;
    }
    //Endpoints with two parameters
    //@GetMapping("/hello/show/{showid}/seat/{seatid}")
    @GetMapping("/show/{showid}/seat/{seatid}")
    public String showdetails(@PathVariable("showid") String showid, @PathVariable("seatid") int seatid){
        return "hello" +showid  + " " + seatid;
    }
}