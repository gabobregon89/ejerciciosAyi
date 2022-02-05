package oramag.sample.one.two.fourteen.rservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import rservice.DepartmentService;
import rservice.EmployeeService;

@ApplicationPath("resources")
public class GenericApplication extends Application {
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        // Register root resources.
        classes.add(DepartmentService.class);
        classes.add(EmployeeService.class);

        // Register provider classes.

        return classes;
    }
}
