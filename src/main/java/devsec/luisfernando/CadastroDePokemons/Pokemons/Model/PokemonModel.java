package devsec.luisfernando.CadastroDePokemons.Pokemons.Model;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhasModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    private String tipo;

    private String especie;

    private int nivel;

    private int vida;

    private int dano;

    @ManyToOne
    @JoinColumn(name = "id_batalha")
    private BatalhasModel batalhas;

}

