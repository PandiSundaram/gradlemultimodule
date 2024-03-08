package com.pandi.RailApiGroovy.Controllers;

import com.pandi.RailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RailController {



    @GetMapping("/")
    public String getTrainTime(){

        return RailService.getRailTime().toString();
    }
}
