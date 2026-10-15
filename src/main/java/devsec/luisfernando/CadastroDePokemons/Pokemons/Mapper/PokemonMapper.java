package devsec.luisfernando.CadastroDePokemons.Pokemons.Mapper;

import devsec.luisfernando.CadastroDePokemons.Pokemons.DTO.PokemonDTO;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import org.springframework.stereotype.Component;

@Component
public class PokemonMapper {

    public PokemonModel map(PokemonDTO pokemonDTO) {
        PokemonModel pokemonModel = new PokemonModel();

        pokemonModel.setId(pokemonDTO.getId());
        pokemonModel.setNome(pokemonDTO.getNome());
        pokemonModel.setEspecie(pokemonDTO.getEspecie());
        pokemonModel.setImgUrl(pokemonDTO.getImgUrl());
        pokemonModel.setLevel(pokemonDTO.getLevel());
        pokemonModel.setBatalhas(pokemonDTO.getBatalhas());

        return pokemonModel;
    }

    public PokemonDTO map(PokemonModel pokemonModel) {
        PokemonDTO pokemonDTO = new PokemonDTO();

        pokemonDTO.setId(pokemonModel.getId());
        pokemonDTO.setNome(pokemonModel.getNome());
        pokemonDTO.setEspecie(pokemonModel.getEspecie());
        pokemonDTO.setImgUrl(pokemonModel.getImgUrl());
        pokemonDTO.setLevel(pokemonModel.getLevel());
        pokemonDTO.setBatalhas(pokemonModel.getBatalhas());

        return pokemonDTO;
    }

}
