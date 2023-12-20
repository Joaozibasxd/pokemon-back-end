package com.project.pokemon.service;

import com.project.pokemon.DTO.ResultadoPokemonConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class PokemonAPIService {
    private static final String API_POKE = "https://pokeapi.co/api/v2/pokemon";

    @Autowired
    private RestTemplate restTemplate;

    public ResultadoPokemonConsulta consultaTodosPokemon(int offSet, int limit) {
       return restTemplate.getForObject(API_POKE + "?limit=" + limit + "&offset=" + offSet, ResultadoPokemonConsulta.class);
    }


}

