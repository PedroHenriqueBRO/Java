package Classes;

import java.time.LocalDate;

public class Worker {
    protected String name;
    protected String birthdate;
    protected int hoursOfWork;

    public Worker(String name, String birthdate, int hoursOfWork) {
        this.name = name;
        this.birthdate = birthdate;
        this.hoursOfWork = hoursOfWork;
    }

    public int getAge(){
        return LocalDate.now().getYear() - Integer.parseInt(birthdate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", hoursOfWork='" + hoursOfWork + '\'' +
                '}';
    }

}
