public abstract class Person {
    private static int counter = 1;
    private final int id;
    private String name;

    public Person(String name) {
        this.id = counter++;
        this.name = name;
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

    @Override
    public String toString() {
        return "ID: " + id + ", Imię: " + name;
    }
}
