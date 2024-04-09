package Classes;

public class HourlyEmployee extends Employee{
    protected double hourlyPayRate;

    public HourlyEmployee(String name, String birthdate, int hoursOfWork, long employeeid, double hourlyPayRate) {
        super(name, birthdate, hoursOfWork, employeeid);
        this.hourlyPayRate = hourlyPayRate;

    }
    public double getPayment() {
        return hourlyPayRate*hoursOfWork;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +", Pagamento : "+getPayment()+
                "} " + super.toString();
    }
}
