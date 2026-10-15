package devsec.luisfernando.CadastroDePokemons.Pokemons.DTO;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {

    private Long id;
    private String nome;
    private String especie;
    private String imgUrl;
    private String level;
    private BatalhaModel batalhas;

}
