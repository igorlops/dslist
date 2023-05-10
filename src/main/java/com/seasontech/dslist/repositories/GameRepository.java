package com.seasontech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seasontech.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

    
}
