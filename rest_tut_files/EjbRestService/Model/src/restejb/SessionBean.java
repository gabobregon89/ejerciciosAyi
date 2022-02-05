package restejb;

import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import restejb.model.Departments;
import restejb.model.Employees;

/**
 * Rest sample source for JDeveloper 12c REST tutorial
 *
 * EJB session facade referenced from the POJO bean exposed as a REST Services. The EJB bean is
 * configured as a Singleton.
 *
 * @author Frank Nimphius 2014
 */

@Singleton (name = "OraMagSessionBean", mappedName = "OraMagSessionBean")
public class SessionBean implements SessionBeanLocal {
    @Resource
    SessionContext sessionContext;
    
    @PersistenceContext(unitName = "Model")
    private EntityManager em;

    public SessionBean() {
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }

    public Employees persistEmployees(Employees employees) {
        em.persist(employees);
        return employees;
    }

    public Employees mergeEmployees(Employees employees) {
        return em.merge(employees);
    }
    
    public Employees findEmployeeById(Integer employeeId){
        return (Employees) em.find(Employees.class,employeeId);
    }

    public void removeEmployees(Employees employees) {
        employees = em.find(Employees.class, employees.getEmployeeId());
        em.remove(employees);
    }

    /** <code>select o from Employees o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Employees> getEmployeesFindAll() {
        return em.createNamedQuery("Employees.findAll", Employees.class).getResultList();
    }

    public Departments persistDepartments(Departments departments) {
        em.persist(departments);
        return departments;
    }

    public Departments mergeDepartments(Departments departments) {
        return em.merge(departments);
    }

    public void removeDepartments(Departments departments) {
        departments = em.find(Departments.class, departments.getDepartmentId());
        em.remove(departments);
    }

    /** <code>select o from Departments o</code> */
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Departments> getDepartmentsFindAll() {
        return em.createNamedQuery("Departments.findAll", Departments.class).getResultList();
    }
    
    public Departments findDepartmentById(Integer departmentId){
        return (Departments) em.find(Departments.class,departmentId);
    }
}
