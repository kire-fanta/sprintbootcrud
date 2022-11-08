package com.example.springApi.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class utilisateurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nom;
    private String contact;
    private String email;

    @OneToOne
    @JoinColumn(name = "groupe_id_groupe")
    private Groupe groupe;

}
