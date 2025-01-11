import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> individuals = new ArrayList<>();

        individuals.add(new Employee("John", "Lennon", "Manager", 27045.78));
        individuals.add(new Employee("George", "Harrison", "Developer", 50000.00));
        individuals.add(new Student("Ringo", "Starr", 2.5));
        individuals.add(new Student("Paul", "McCartney", 3.8));

        Collections.sort(individuals);

        displayDetails(individuals);
    }

    public static void displayDetails(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + " earns " + person.calculateEarnings() + " tenge");
        }
    }
}
