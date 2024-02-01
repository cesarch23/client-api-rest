package com.edu.clientapirest.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String name;
    private String lastname;
    private LocalDate birthDate;

    public Client() {
    }


}
