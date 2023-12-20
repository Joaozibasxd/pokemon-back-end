package com.project.pokemon.DTO;

import lombok.Data;

import java.util.List;


@Data
public class ResultadoPokemonConsulta {
    private Integer count;
    private String next;
    private String previous;
    private List<PokemonConsultaApiDTO> results;
}
