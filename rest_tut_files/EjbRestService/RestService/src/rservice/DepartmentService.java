package rservice;

import javax.ejb.EJB;

import javax.inject.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import restejb.SessionBeanLocal;
import rservice.model.DepartmentList;

/**
 * Rest sample source for JDeveloper 12c REST tutorial
 *
 * This REST Pojo class simply dispatches between the REST client and the EJB session bean.
 * The reason for having this POJO between has the following reasons:
 *
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
@Path("tut/department")

public class DepartmentService {

    //Lookup EJB session bean
    @EJB
    SessionBeanLocal SessionBean;

    public DepartmentService() {
        super();
    }

    /**
     * Queries all departments accessible from the EJB facade
     * @return ListOfDepartments class that wraps a List of Departments objects
     */
    @GET
    @Produces("application/xml")
    @Path("/")
    public DepartmentList getAll() {
        DepartmentList listOfDepartments = new DepartmentList();
        listOfDepartments.setDepartmentsList(SessionBean.getDepartmentsFindAll());
        return listOfDepartments;
    }
}
