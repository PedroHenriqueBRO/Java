package Classes;

public class Employee extends Worker{
    protected long employeeid;

    public Employee(String name, String birthdate, int hoursOfWork, long employeeid) {
        super(name, birthdate, hoursOfWork);
        this.employeeid = employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                "} " + super.toString();
    }
}
