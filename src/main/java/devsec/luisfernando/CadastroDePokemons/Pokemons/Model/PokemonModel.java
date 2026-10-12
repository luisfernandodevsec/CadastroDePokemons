package devsec.luisfernando.CadastroDePokemons.Pokemons.Model;

import devsec.luisfernando.CadastroDePokemons.Batalhas.Model.BatalhasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String tipo;

    private String especie;

    private int nivel;

    private int vida;

    private int dano;

    @ManyToOne
    @JoinColumn(name = "id_batalha")
    private BatalhasModel batalhas;

    public PokemonModel() {
    }

    public PokemonModel(Long id, String nome, String tipo, String especie, int nivel, int vida, int dano) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.especie = especie;
        this.nivel = nivel;
        this.vida = vida;
        this.dano = dano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

}
