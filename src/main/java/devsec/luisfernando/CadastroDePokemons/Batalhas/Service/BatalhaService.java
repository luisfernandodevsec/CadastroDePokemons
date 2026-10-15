package devsec.luisfernando.CadastroDePokemons.Batalhas.Service;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhaModel;
import devsec.luisfernando.CadastroDePokemons.Batalhas.Repository.BatalhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatalhaService {

    @Autowired
    private BatalhaRepository batalhaRepository;

    public List<BatalhaModel> listarBatalhas()
    {
        return batalhaRepository.findAll();
    }

    public Optional<BatalhaModel> listarBatalhasPorId(Long id)
    {
        return batalhaRepository.findById(id);
    }

    public BatalhaModel criarBatalha(BatalhaModel batalha)
    {
        return batalhaRepository.save(batalha);
    }

    public void deletarBatalha(Long id) {
        batalhaRepository.deleteById(id);
    }

}
