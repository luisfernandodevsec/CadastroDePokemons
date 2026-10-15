package devsec.luisfernando.CadastroDePokemons.Batalhas.Controller;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhaModel;
import devsec.luisfernando.CadastroDePokemons.Batalhas.Service.BatalhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/batalha")
@RestController
public class BatalhasController {

    @Autowired
    private BatalhaService batalhaService;

    @GetMapping("/listar")
    public List<BatalhaModel> listarBatalhas() {
        return batalhaService.listarBatalhas();
    }

    @GetMapping("/listar/{id}")
    public Optional<BatalhaModel> listarBatalhas(@PathVariable Long id) {
        return batalhaService.listarBatalhasPorId(id);
    }

    @PostMapping("/criar")
    public BatalhaModel adicionarBatalha(@RequestBody BatalhaModel batalha) {
        return batalhaService.criarBatalha(batalha);
    }

    @PutMapping("/editar/{id}")
    public void editarBatalha(@PathVariable Long id) {
        batalhaService.deletarBatalha(id);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarBatalha(@PathVariable Long id) {
        return "Deletando batalha";
    }

}
