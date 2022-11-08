package com.example.springApi.service;

import com.example.springApi.models.utilisateurs;
import com.example.springApi.repository.utilisateursReposotory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class utilisateursServiceImpl implements utilisateursService{
    @Autowired
    utilisateursReposotory userRepo;

    @Override
    public utilisateurs creer(utilisateurs Utilisateurs) {
        return userRepo.save(Utilisateurs);
    }

    @Override
    public List<utilisateurs> lire() {

        return userRepo.findAll();
    }


    @Override
    public utilisateurs modifier(long id, utilisateurs Utilisateurs) {
        return  userRepo.findById(id)
                .map(u -> {
                    u.setNom(u.getNom());
                    return userRepo.save(u);

                }).orElseThrow(() -> new RuntimeException("utilisateurs non trouvé"));
    }

    @Override
    public String supprimer(long id) {
        userRepo.deleteById(id);
        return"utilisateurs supprime" ;
    }
}
