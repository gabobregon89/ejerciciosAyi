package restejb;

import java.util.List;

import javax.ejb.Local;

import restejb.model.Departments;
import restejb.model.Employees;

@Local
public interface SessionBeanLocal {
    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);

    Employees persistEmployees(Employees employees);

    Employees mergeEmployees(Employees employees);

    void removeEmployees(Employees employees);

    List<Employees> getEmployeesFindAll();
    
    public Employees findEmployeeById(Integer employeeId);

    Departments persistDepartments(Departments departments);

    Departments mergeDepartments(Departments departments);

    void removeDepartments(Departments departments);

    List<Departments> getDepartmentsFindAll();
    
    public Departments findDepartmentById(Integer employeeId);
}
