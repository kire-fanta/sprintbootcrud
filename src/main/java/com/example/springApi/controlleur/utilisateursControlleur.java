package com.example.springApi.controlleur;

import com.example.springApi.models.utilisateurs;
import com.example.springApi.service.utilisateursService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateurs")
@AllArgsConstructor
public class utilisateursControlleur {
    private final  utilisateursService Uservice;
    @PostMapping ("/create")
    public utilisateurs create (@RequestBody  utilisateurs Utilisateurs){

        return Uservice.creer(Utilisateurs);
    }
    @GetMapping
    public List<utilisateurs> read(){
        return Uservice.lire();

    }
    @PutMapping
    public utilisateurs update (@PathVariable Long id, @RequestBody utilisateurs Utilisateurs){
        return Uservice.modifier(id,Utilisateurs) ;

        }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return Uservice.supprimer(id);
    }
}

