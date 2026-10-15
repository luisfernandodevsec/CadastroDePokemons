package devsec.luisfernando.CadastroDePokemons.Pokemons.Service;

import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<PokemonModel> listarPokemons() {
        return pokemonRepository.findAll();
    }

    public Optional<PokemonModel> buscarPokemonPorId(Long id) {
        return pokemonRepository.findById(id);
    }

    public PokemonModel criarPokemon(PokemonModel pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void deletarPokemon(Long id) {
        pokemonRepository.deleteById(id);
    }

    public PokemonModel editarPokemon(Long id, PokemonModel pokemon) {
        if (pokemonRepository.existsById(id)) {
            pokemon.setId(id);
            return pokemonRepository.save(pokemon);
        }

        return null;
    }
}
