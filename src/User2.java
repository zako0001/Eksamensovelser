public class User2 implements DataObject {

    // Attributes
    private int id;
    private String name;
    private String userName;

    // Constructor
    public User2(int id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    // DataObject methods
    @Override
    public int getId() {
        return id;
    }

    @Override
    public String[] getData() {
        return new String[] {"" + id, name, userName};
    }
}