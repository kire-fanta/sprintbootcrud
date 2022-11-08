package com.example.springApi.repository;

import com.example.springApi.models.utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface utilisateursReposotory extends JpaRepository<utilisateurs,Long> {
}
