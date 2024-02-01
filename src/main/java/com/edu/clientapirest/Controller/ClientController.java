package com.edu.clientapirest.Controller;

import com.edu.clientapirest.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/api/client/{id}")
    public int getAge(@PathVariable int id){
        return clientService.ageCalc(id);
    }
}
