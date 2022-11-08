package com.example.springApi.service;

import com.example.springApi.models.Groupe;

import java.util.List;

public interface GroupeService {

    Groupe creer(Groupe groupe);

    List<Groupe> lire();
}
