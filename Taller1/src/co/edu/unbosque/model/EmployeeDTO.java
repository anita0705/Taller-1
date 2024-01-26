package co.edu.unbosque.model;

public class EmployeeDTO extends User {

    private float salaryBase;

    public EmployeeDTO() {
        // TODO Auto-generated constructor stub
    }

    public EmployeeDTO(float salaryBase) {
        super();
        this.salaryBase = salaryBase;
    }

    public EmployeeDTO(long id, String name, String businessName, float salaryBase) {
        super(id, name, businessName);
        this.salaryBase = salaryBase;
    }

    public EmployeeDTO(long id, String name, String businessName) {
        super(id, name, businessName);
        // TODO Auto-generated constructor stub
    }

    public float getSalaryBase() {
        return salaryBase;
    }

    public void setSalaryBase(float salaryBase) {
        this.salaryBase = salaryBase;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [salaryBase=" + salaryBase + "]";
    }

}