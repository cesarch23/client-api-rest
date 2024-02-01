package com.edu.clientapirest.service;

import com.edu.clientapirest.Repositories.ClientRepository;
import com.edu.clientapirest.entity.Client;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public int ageCalc(int id){
        Client client1 = clientRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("el cliente no existe"));
        Period period = Period.between(client1.getBirthDate(),LocalDate.now());
        return  period.getYears();
    }


}
