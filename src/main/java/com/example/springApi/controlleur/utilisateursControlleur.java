package com.example.springApi.controlleur;

import com.example.springApi.models.utilisateurs;
import com.example.springApi.service.utilisateursService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
@AllArgsConstructor
public class utilisateursControlleur {
    @Autowired
    private final  utilisateursService Uservice;
    @PostMapping ("/create")
    public utilisateurs create (@RequestBody  utilisateurs Utilisateurs){

        return Uservice.creer(Utilisateurs);
    }
    @GetMapping ("/afficher")
    public List<utilisateurs> read(){
        return Uservice.lire();

    }
    @PutMapping("/modifier/{id}")
    public utilisateurs update (@RequestBody  utilisateurs Utilisateurs,@PathVariable Long id){
        return Uservice.modifier(Utilisateurs,id) ;

        }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return Uservice.supprimer(id);
    }
}

