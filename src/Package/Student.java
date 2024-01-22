package Package;

public class Student extends Person {
    private double gpa;

    public Student() {
        super();
        setGpa(0d);
    }

    public Student(String name, String surname, Double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        if (gpa > 2.67) return 36600;
        return 0;
    }

    public String toString() {
        return getPosition() + ":" + super.toString();
    }
}