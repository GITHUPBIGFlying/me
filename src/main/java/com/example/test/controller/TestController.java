package com.example.test.controller;

import com.example.test.entity.PacsCache;
import com.example.test.entity.Patients;
import com.example.test.service.impl.PacsCacheServiceImpl;
import com.example.test.service.impl.PatientsServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private PatientsServiceImpl patientsService;
    @Autowired
    private PacsCacheServiceImpl pacsCacheService;


    @RequestMapping("/index")
    @ResponseBody
    public  String data(){
        Gson gson = new Gson();
        Patients pa = patientsService.getPatient("82361411");
        System.out.println(gson.toJson(pa));

        return "13214564654654";
    }

    @RequestMapping("/test")
    @ResponseBody
    public  String test(){
        Gson gson = new Gson();
        PacsCache pa = pacsCacheService.getPacsCache("114");
        System.out.println(gson.toJson(pa));

        return "000000000000011111111";
    }

}
