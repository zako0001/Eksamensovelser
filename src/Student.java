public class Student implements DataObject {

    // Attributes
    private int id;
    private String name;
    private String email;

    // Constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // DataObject methods
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String[] getData() {
        return new String[] {"" + id, name, email};
    }
}