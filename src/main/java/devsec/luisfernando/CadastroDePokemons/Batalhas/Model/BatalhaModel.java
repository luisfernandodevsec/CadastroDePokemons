package devsec.luisfernando.CadastroDePokemons.Batalhas.Model;

import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_batalhas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatalhaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dificuldade;

    private String status;

    @OneToMany(mappedBy = "batalhas")
    private List<PokemonModel> pokemons;

}
