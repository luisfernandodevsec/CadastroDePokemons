package devsec.luisfernando.CadastroDePokemons.Batalhas.Repository;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatalhaRepository extends JpaRepository<BatalhaModel, Long> {
}
