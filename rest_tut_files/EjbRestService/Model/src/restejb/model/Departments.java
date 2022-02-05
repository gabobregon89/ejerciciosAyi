package restejb.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 * Rest sample source for JDeveloper 12c REST tutorial
 *
 * Entity defined as an XmlRootElement for its use with REST Services
 *
 * @author Frank Nimphius 2014
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Departments.findAll", query = "select o from Departments o") })
@XmlRootElement
public class Departments implements Serializable {
    private static final long serialVersionUID = 5837404811584848716L;
    @Id
    @Column(name = "DEPARTMENT_ID", nullable = false)
    private Integer departmentId;
    @Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
    private String departmentName;
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    @Column(name = "MANAGER_ID")
    private Integer managerId;
    @XmlTransient
    @OneToMany(mappedBy = "departments", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Employees> containedEmployees;

    public Departments() {
    }

    public Departments(Integer departmentId, String departmentName, Integer locationId, Integer managerId) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.locationId = locationId;
        this.managerId = managerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    @XmlTransient
    public List<Employees> getContainedEmployees() {
        return containedEmployees;
    }

    @XmlTransient
    public void setContainedEmployees(List<Employees> containedEmployees) {
        this.containedEmployees = containedEmployees;
    }

    public Employees addEmployees(Employees employees) {
        getContainedEmployees().add(employees);
        employees.setDepartments(this);
        return employees;
    }

    public Employees removeEmployees(Employees employees) {
        getContainedEmployees().remove(employees);
        employees.setDepartments(null);
        return employees;
    }
}
