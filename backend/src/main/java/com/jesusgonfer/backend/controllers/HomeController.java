package com.jesusgonfer.backend.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin
public class HomeController {

    @GetMapping(value="/prueba", produces=MediaType.TEXT_XML_VALUE) //text/xml
    public String getMethodName() {
        String a = "<breakfast_menu>"+
                        "<food>"+
                            "<name>Belgian Waffles</name>"+
                            "<price>$5.95</price>"+
                            "<description>Two of our famous Belgian Waffles with plenty of real maple syrup</description>"+
                            "<calories>650</calories> </food>"+
                            "</breakfast_menu>";

        return a;
    }
    
    
}