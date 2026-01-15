package modelo.muitopramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    @ManyToMany(mappedBy ="sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {

    }

    public Sobrinho(String nome) {
        super();
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
