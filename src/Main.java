import Package.Person;
import Package.Student;
import Package.Employee;
public class Main {
    public static void main(String[] args) {
        Person Student1 = new Student("Ringo ", "Starr", 1.9);
        Person Student2 = new Student("Paul ", "McCartney", 3.0);
        Person Employee1 = new Employee("John ", "Lennon", "Junior", 27045.78);
        Person Employee2 = new Employee("George ", "Harrison", "Senior", 50000.00);
        PrintData(Student1, Student2, Employee1, Employee2);
    }

    public static void PrintData(Person... persons) {
        for (Person person : persons) {
            String Data = (person.toString() + " earns " + person.getPaymentAmount() + " tenge");
            System.out.println(Data);
        }
    }
}


