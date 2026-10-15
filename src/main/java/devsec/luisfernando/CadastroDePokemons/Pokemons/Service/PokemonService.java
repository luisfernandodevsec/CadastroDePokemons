package devsec.luisfernando.CadastroDePokemons.Pokemons.Service;

import devsec.luisfernando.CadastroDePokemons.Pokemons.DTO.PokemonDTO;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Mapper.PokemonMapper;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Autowired
    private PokemonMapper pokemonMapper;

    public List<PokemonDTO> listarPokemons() {
        List<PokemonModel> pokemons = pokemonRepository.findAll();
        return pokemons.stream()
                .map(pokemonMapper::map)
                .collect(Collectors.toList());
    }

    public Optional<PokemonDTO> buscarPokemonPorId(Long id) {
        Optional<PokemonModel> pokemon = pokemonRepository.findById(id);
        return pokemon.map(pokemonMapper::map);
    }

    public PokemonDTO criarPokemon(PokemonDTO pokemonDTO) {
        PokemonModel pokemon = pokemonMapper.map(pokemonDTO);
        return pokemonMapper.map(pokemonRepository.save(pokemon));
    }

    public void deletarPokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    public PokemonDTO editarPokemon(Long id, PokemonDTO pokemon) {
        Optional<PokemonModel> existe = pokemonRepository.findById(id);

        if (existe.isPresent()) {
            PokemonModel atualizado = pokemonMapper.map(pokemon);
            atualizado.setId(id);
            return pokemonMapper.map(pokemonRepository.save(atualizado));
        }

        return null;
    }
}
