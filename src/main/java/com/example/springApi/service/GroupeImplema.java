package com.example.springApi.service;

import com.example.springApi.models.Groupe;
import com.example.springApi.repository.groupeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class GroupeImplema implements GroupeService {

    private groupeRepo repoGroup;

    @Override
    public Groupe creer(Groupe groupe) {
        return repoGroup.save(groupe);
    }

    @Override
    public List<Groupe> lire() {
        return repoGroup.findAll();
    }
}
