package rservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import restejb.model.Employees;

/**
 * Helper class that allows a list of type <Employees> to be unmarshall into a XML file.
 * @author Frank Nimphius 2014
 */
@XmlRootElement
public class EmployeeList {

    List<Employees> employeesList = new ArrayList<Employees>();

    @XmlElement(name="allemployees")
    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    };
}
