package castudy.modles;

public class EmployeeProfile {
    private Employee employee;

    public EmployeeProfile(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeProfile{" +
                "employee=" + employee +
                '}';
    }
}
