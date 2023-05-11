package com.seasontech.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.seasontech.dslist.dto.GameDTO;
import com.seasontech.dslist.dto.GameMinDTO;
import com.seasontech.dslist.entities.Game;
import com.seasontech.dslist.projections.GameMinProjection;
import com.seasontech.dslist.repositories.GameRepository;


@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x-> new GameMinDTO(x)).toList();
    }    

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x-> new GameMinDTO(x)).toList();
    } 

}
