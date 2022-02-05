package tutorial.tareasWeb.model.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQueries({ @NamedQuery(name = "Estados.findAll", query = "select o from Estados o") })
public class Estados implements Serializable {
    private static final long serialVersionUID = -751939712456909896L;
    private String estados;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
    generator="SEQ_TEMAS")
    @SequenceGenerator(name="seqEstados",sequenceName="SEQ_ESTADOS",
    allocationSize=1)
    private Long sid;
    @OneToMany(mappedBy = "estados", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Temas> temasList;

    public Estados() {
    }

    public Estados(String estados, Long sid) {
        this.estados = estados;
        this.sid = sid;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public List<Temas> getTemasList() {
        return temasList;
    }

    public void setTemasList(List<Temas> temasList) {
        this.temasList = temasList;
    }

    public Temas addTemas(Temas temas) {
        getTemasList().add(temas);
        temas.setEstados(this);
        return temas;
    }

    public Temas removeTemas(Temas temas) {
        getTemasList().remove(temas);
        temas.setEstados(null);
        return temas;
    }
}
