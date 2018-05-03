package staff.manager;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String nationalInsuranceNo, double salary, String departmentName, double budget) {
        super(name, nationalInsuranceNo, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return this.salary * 0.02;
    }
}
