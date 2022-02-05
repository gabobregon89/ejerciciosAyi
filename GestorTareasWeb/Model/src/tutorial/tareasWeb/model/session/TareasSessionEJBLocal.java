package tutorial.tareasWeb.model.session;

import javax.ejb.Local;

import tutorial.tareasWeb.model.entities.Estados;
import tutorial.tareasWeb.model.entities.Notas;
import tutorial.tareasWeb.model.entities.Temas;

@Local
public interface TareasSessionEJBLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    void removeEstados(Estados estados);

    void removeNotas(Notas notas);

    void removeTemas(Temas temas);
}
