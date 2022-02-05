package tutorial.tareasWeb.model.entities;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({ @NamedQuery(name = "Notas.findAll", query = "select o from Notas o") })
public class Notas implements Serializable {
    private static final long serialVersionUID = -6145386111251990943L;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private String nota;
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,
    generator="SEQ_TEMAS")
    @SequenceGenerator(name="seqNotas",sequenceName="SEQ_NOTAS",
    allocationSize=1)
    private Long sid;
    @ManyToOne
    @JoinColumn(name = "FK_TEMA")
    private Temas temas;

    public Notas() {
    }

    public Notas(Date fecha, Temas temas, String nota, Long sid) {
        this.fecha = fecha;
        this.temas = temas;
        this.nota = nota;
        this.sid = sid;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Temas getTemas() {
        return temas;
    }

    public void setTemas(Temas temas) {
        this.temas = temas;
    }
}
