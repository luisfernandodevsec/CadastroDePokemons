package devsec.luisfernando.CadastroDePokemons.Pokemons.Controller;

import devsec.luisfernando.CadastroDePokemons.Pokemons.DTO.PokemonDTO;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import devsec.luisfernando.CadastroDePokemons.Pokemons.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/listar")
    public ResponseEntity<List<PokemonDTO>> listarPokemons() {
        return ResponseEntity.status(HttpStatus.OK).body(pokemonService.listarPokemons());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarPokemonsPorId(@PathVariable Long id) {
        if (pokemonService.listarPokemonPorId(id).isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(pokemonService.listarPokemonPorId(id));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pokemon não encontrado!");
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarPokemon(@RequestBody PokemonDTO pokemon) {
        PokemonDTO dto = pokemonService.criarPokemon(pokemon);

        return ResponseEntity.status(HttpStatus.CREATED).body("Pokemon criado com sucesso! " + dto.getNome() + " com id " + dto.getId());
    }

    @PutMapping("/editar/{id}")
    public ResponseEntity<?> editarPokemon(@PathVariable Long id, @RequestBody PokemonDTO pokemon) {
        if (pokemonService.listarPokemonPorId(id).isPresent()) {
            pokemonService.editarPokemon(id, pokemon);

            return ResponseEntity.status(HttpStatus.OK).body(pokemonService.listarPokemonPorId(id));
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pokemon não encontrado!");
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarPokemon(@PathVariable Long id) {
        String nome;

        if (pokemonService.listarPokemonPorId(id).isPresent()) {
            nome = pokemonService.listarPokemonPorId(id).get().getNome();
            pokemonService.deletarPokemon(id);
            return ResponseEntity.ok().body("Pokemon deletado com sucesso! " + nome);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pokemon não encontrado!");
    }

}
