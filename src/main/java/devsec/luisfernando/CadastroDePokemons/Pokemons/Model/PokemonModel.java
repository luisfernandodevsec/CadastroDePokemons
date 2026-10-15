package devsec.luisfernando.CadastroDePokemons.Pokemons.Model;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhaModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;

    private String especie;

    @Column(name = "img_url", unique = true)
    private String imgUrl;

    private String level;

    @ManyToOne
    @JoinColumn(name = "id_batalha")
    private BatalhaModel batalhas;

}

