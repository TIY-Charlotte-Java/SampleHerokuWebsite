package com.example.services;

import com.example.entities.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ben on 1/21/17.
 */
public interface GameRepository extends CrudRepository<Game, Integer> {
}
