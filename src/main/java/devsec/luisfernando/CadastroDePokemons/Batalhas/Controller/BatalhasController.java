package devsec.luisfernando.CadastroDePokemons.Batalhas.Controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class BatalhasController {

    @GetMapping("/batalha/listar")
    public String listarBatalhas() {
        return "Listando batalhas";
    }

    @GetMapping("/batalha/listar/{id}")
    public String listarBatalhas(@PathVariable Long id) {
        return "Listando batalhas";
    }

    @PostMapping("/batalha/criar")
    public String adicionarBatalha() {
        return "Adicionando batalha";
    }

    @PutMapping("/batalha/editar/{id}")
    public String editarBatalha(@PathVariable Long id) {
        return "Editando batalha";
    }

    @DeleteMapping("/batalha/deletar/{id}")
    public String deletarBatalha(@PathVariable Long id) {
        return "Deletando batalha";
    }

}
