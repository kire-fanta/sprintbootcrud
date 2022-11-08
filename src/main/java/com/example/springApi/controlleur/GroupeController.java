package com.example.springApi.controlleur;

import com.example.springApi.models.Groupe;
import com.example.springApi.models.utilisateurs;
import com.example.springApi.service.GroupeService;
import com.example.springApi.service.utilisateursService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
@AllArgsConstructor
public class GroupeController {
    @Autowired
    private final GroupeService groupeService;

    @PostMapping ("/create")
    public Groupe create (@RequestBody  Groupe groupe){

        return groupeService.creer(groupe);
        }
}

