package com.seasontech.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seasontech.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long>{
    
}
