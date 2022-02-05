package rservice;

import java.util.List;

import javax.ejb.EJB;

import javax.inject.Singleton;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import restejb.SessionBeanLocal;
import restejb.model.Departments;
import restejb.model.Employees;
import rservice.errors.ResourceNotFoundException;
import rservice.model.EmployeeList;

/**
 * Rest sample source for JDeveloper 12c REST tutorial
 *
 * This REST Pojo class simply dispatches between the REST client and the EJB session bean.
 * The reason for having this POJO between has the following reasons:
 *
 * 1. as of REST 1.1 in JDeveloper 12c, EJB beans cannot be directly exposed as REST sources
 * 2. using annotations, it is tempting to dirty code sources with annotations not belonging
 *    to a source (EJB in this case) but its uage (REST in this case). So purely to keep REST
 *    matters separate from the EJB model, I prefer having an abstraction layer defined.
 *
 * Disclaimer:
 * ===========
 * This REST POJO class is designed to meet the requirements of the use case covered in the
 * REST tutorial. It is not a fully designed POJO REST
 * resource. The reason for not providing a full CRUD REST resource implementation is to keep
 * it simple for readers of Oracle Magazine to be able to follow the hands-on steps in the
 * article in a reasonable amount of time.
 *
 * @author Frank Nimphius 2014
 */

//the annotated @EJB lookup appears not working without this
//singleton annotation

@Singleton
@Path("tut/employee")
public class EmployeeService {

    //Lookup EJB session bean
    @EJB
    SessionBeanLocal SessionBean;

    public EmployeeService() {
        super();
    }

    /**
     * Method to call to obtain the detail data (employee) for a selected department
     * (departmentId). This eliminates the need for nested objects to be send to the
     * client to display master - detail behaviors
     *
     * @param departmentId
     * @return ListOfEmployees class that wraps a List of Employees objects
     */
    @GET
    @Produces("application/xml")
    @Path("/{departmentId}")
    public EmployeeList getByDepartmentId(@PathParam("departmentId") int departmentId) {
        EmployeeList listOfEmployees = new EmployeeList();
        Departments department = SessionBean.findDepartmentById(departmentId);
        if (department != null) {
            List<Employees> empList = (List<Employees>) department.getContainedEmployees();
            listOfEmployees.setEmployeesList(empList);
        } else {
            throw new ResourceNotFoundException("The department resource with the id "+departmentId+ "could not be found");
        }
        return listOfEmployees;
    }

    /**
     * Updates an existing employee row identified by the employee ID
     * @param employee
     * @return
     */
    @POST
    @Consumes("application/xml")
    @Path("/")
    public Response update(Employees employee) {        
        //find the employee record
        Employees persistedEmployeeRecord = SessionBean.findEmployeeById(employee.getEmployeeId());        
        if (persistedEmployeeRecord != null) {
           //update employee object
           persistedEmployeeRecord.setFirstName(employee.getFirstName());
           persistedEmployeeRecord.setLastName(employee.getLastName());
           persistedEmployeeRecord.setEmail(employee.getEmail());  
           persistedEmployeeRecord.setManagerId(employee.getManagerId());  
           persistedEmployeeRecord.setPhoneNumber(employee.getPhoneNumber());             
           persistedEmployeeRecord.setHireDate(employee.getHireDate());             
           persistedEmployeeRecord.setCommissionPct(employee.getCommissionPct());  
           persistedEmployeeRecord.setSalary(employee.getSalary());  
           persistedEmployeeRecord.setJobId(employee.getJobId());  
           //persist the change
           SessionBean.mergeEmployees(persistedEmployeeRecord);           
           }
           else{
           
             throw new ResourceNotFoundException("The employee resource with the id "+employee.getEmployeeId()+ "could not be found");
           }
        return Response.ok().build();
    }

    @DELETE
    @Path("/{employeeId}")
    public Response removeById(@PathParam("employeeId") int employeeId) {
        Employees emp = SessionBean.findEmployeeById(employeeId);
        if (emp != null) {
            SessionBean.removeEmployees(emp);            
        }
        else{
            throw new ResourceNotFoundException("The employee resource with the id "+employeeId+ "could not be found");
        }
        return Response.ok().build();
    }

}
