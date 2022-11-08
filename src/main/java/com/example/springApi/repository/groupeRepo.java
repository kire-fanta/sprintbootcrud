package com.example.springApi.repository;

import com.example.springApi.models.Groupe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface groupeRepo extends JpaRepository<Groupe, Long> {

}
