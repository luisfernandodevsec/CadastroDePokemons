package devsec.luisfernando.CadastroDePokemons.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String specie;
    private int level;
    private int health;
    private int damage;

    public PokemonModel() {
    }

    public PokemonModel(String name, String type, String specie, int level, int health, int damage) {
        this.name = name;
        this.type = type;
        this.specie = specie;
        this.level = level;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
