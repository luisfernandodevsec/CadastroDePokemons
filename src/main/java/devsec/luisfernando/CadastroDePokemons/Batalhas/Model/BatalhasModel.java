package devsec.luisfernando.CadastroDePokemons.Batalhas.Model;

import devsec.luisfernando.CadastroDePokemons.Pokemons.Model.PokemonModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_batalhas")
public class BatalhasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dificuldade;

    private String status;

    @OneToMany(mappedBy = "batalhas")
    private List<PokemonModel> pokemons;

    public BatalhasModel() {
    }

    public BatalhasModel(Long id, String dificuldade, String status) {
        this.id = id;
        this.dificuldade = dificuldade;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
