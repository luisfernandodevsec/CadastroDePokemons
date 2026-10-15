package devsec.luisfernando.CadastroDePokemons.Pokemons.Controller;

import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/listar")
    public List<PokemonModel> listarPokemons() {
        return pokemonService.listarPokemons();
    }

    @GetMapping("/listar/{id}")
    public Optional<PokemonModel> listarPokemonsPorId(@PathVariable Long id) {
        return pokemonService.buscarPokemonPorId(id);
    }

    @PostMapping("/criar")
    public PokemonModel criarPokemon(@RequestBody PokemonModel pokemon) {
        return pokemonService.criarPokemon(pokemon);
    }

    @PutMapping("/editar/{id}")
    public PokemonModel editarPokemon(@PathVariable Long id, @RequestBody PokemonModel pokemon) {
        return pokemonService.editarPokemon(id, pokemon);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPokemon(@PathVariable Long id) {
        pokemonService.deletarPokemon(id);
    }

}
