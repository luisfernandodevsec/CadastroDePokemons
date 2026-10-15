package devsec.luisfernando.CadastroDePokemons.Pokemons.Repository;

import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<PokemonModel, Long> {

}
