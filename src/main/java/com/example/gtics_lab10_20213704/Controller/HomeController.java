package com.example.gtics_lab10_20213704.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //TRABAJEMOS

    @GetMapping(value="/verPrincipal")
    public String verPrincipal(){
        //ULTIMO
        return "Principal";
    }
}
