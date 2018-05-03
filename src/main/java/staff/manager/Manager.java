package staff.manager;

import staff.Employee;

public class Manager extends Employee{

    private String departmentName;

    public Manager(String name, String nationalInsuranceNo, double salary, String departmentName) {
        super(name, nationalInsuranceNo, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
