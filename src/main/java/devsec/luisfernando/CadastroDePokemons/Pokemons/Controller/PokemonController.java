package devsec.luisfernando.CadastroDePokemons.Pokemons.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PokemonController {

    @GetMapping("/pokemon/listar")
    public String listarPokemons() {
        return "Lista de pokemons";
    }

    @GetMapping("/pokemon/listar/{id}")
    public String listarPokemonsPorId(@PathVariable Long id) {
        return "Listar pokemons por ID";
    }

    @PostMapping("/pokemon/criar")
    public String criarPokemon() {
        return "Criando pokemon";
    }

    @PutMapping("/pokemon/editar/{id}")
    public String editarPokemon(@PathVariable Long id) {
        return "Editar pokemon";
    }

    @DeleteMapping("/pokemon/deletar/{id}")
    public String deletarPokemon(@PathVariable Long id) {
        return "Deletar pokemon";
    }

}
