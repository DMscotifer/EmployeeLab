package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNo;
    public double salary;

    public Employee(String name, String nationalInsuranceNo, double salary) {
        this.name = name;
        this.nationalInsuranceNo = nationalInsuranceNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsuranceNo() {
        return nationalInsuranceNo;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(Double payRise){
        if (payRise > 0) {
            this.salary += payRise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }
}
