package tutorial.tareasWeb.model.entities;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQueries({ @NamedQuery(name = "Temas.findAll", query = "select o from Temas o") })
public class Temas implements Serializable {
    private static final long serialVersionUID = 6973790457263122421L;
    private String descripcion;
    private String incidencias;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
    generator="SEQ_TEMAS")
    @SequenceGenerator(name="seqTemas",sequenceName="SEQ_TEMAS",
    allocationSize=1)
    private Long sid;
    private String tema;
    @OneToMany(mappedBy = "temas", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Notas> notasList;
    @ManyToOne
    @JoinColumn(name = "FK_ESTADO")
    private Estados estados;

    public Temas() {
    }

    public Temas(String descripcion, Estados estados, String incidencias, Long sid, String tema) {
        this.descripcion = descripcion;
        this.estados = estados;
        this.incidencias = incidencias;
        this.sid = sid;
        this.tema = tema;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public String getIncidencias() {
        return incidencias;
    }

    public void setIncidencias(String incidencias) {
        this.incidencias = incidencias;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public List<Notas> getNotasList() {
        return notasList;
    }

    public void setNotasList(List<Notas> notasList) {
        this.notasList = notasList;
    }

    public Notas addNotas(Notas notas) {
        getNotasList().add(notas);
        notas.setTemas(this);
        return notas;
    }

    public Notas removeNotas(Notas notas) {
        getNotasList().remove(notas);
        notas.setTemas(null);
        return notas;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }
}
