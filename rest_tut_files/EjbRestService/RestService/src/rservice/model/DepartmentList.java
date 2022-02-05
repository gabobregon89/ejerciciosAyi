package rservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import restejb.model.Departments;

/**
 * Helper class that allows a list of type <Departments> to be unmarshall into a XML file.
 * @author Frank Nimphius 2014
 */
@XmlRootElement
public class DepartmentList {

    List<Departments> departmentsList = new ArrayList<Departments>();

    @XmlElement(name="alldepartments")
    public List<Departments> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(List<Departments> departmentsList) {
        this.departmentsList = departmentsList;
    };
}

