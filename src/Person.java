public abstract class Person implements Payable, Comparable<Person> {
    private static int uniqueId = 1;
    private int id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.id = uniqueId++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
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

    public abstract String getRole();

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.calculateEarnings(), other.calculateEarnings());
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
