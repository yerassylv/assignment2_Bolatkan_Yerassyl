package Package;

public class Person implements Payable {
    private int id;
    private String name;
    private String surname;

    public String toString() {
        return id + ":" + name + surname;
    }

    public Person() {
        setName("Someone");
        setSurname("Unknown");
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}