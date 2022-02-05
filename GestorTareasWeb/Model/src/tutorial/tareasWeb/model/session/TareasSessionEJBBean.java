package tutorial.tareasWeb.model.session;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tutorial.tareasWeb.model.entities.Estados;
import tutorial.tareasWeb.model.entities.Notas;
import tutorial.tareasWeb.model.entities.Temas;

@Stateless(name = "TareasSessionEJB", mappedName = "GestorTareasWeb-Model-TareasSessionEJB")
public class TareasSessionEJBBean implements TareasSessionEJB, TareasSessionEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "persistenceUnit")
    private EntityManager em;

    public TareasSessionEJBBean() {
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }

    public void removeEstados(Estados estados) {
        estados = em.find(Estados.class, estados.getSid());
        em.remove(estados);
    }

    public void removeNotas(Notas notas) {
        notas = em.find(Notas.class, notas.getSid());
        em.remove(notas);
    }

    public void removeTemas(Temas temas) {
        temas = em.find(Temas.class, temas.getSid());
        em.remove(temas);
    }
}
