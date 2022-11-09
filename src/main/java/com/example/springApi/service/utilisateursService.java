package com.example.springApi.service;

import com.example.springApi.models.utilisateurs;

import java.util.List;

public interface utilisateursService {
    utilisateurs creer(utilisateurs Utilisateurs);
    List<utilisateurs> lire();

    utilisateurs modifier( utilisateurs Utilisateurs, Long id);

    String supprimer (long id);
}
