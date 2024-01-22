package Package;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
        setSalary(0d);
    }

    public Employee(String name, String surname, String position, Double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }

    public String toString() {
        return getPosition() + ":" + super.toString();
    }
}