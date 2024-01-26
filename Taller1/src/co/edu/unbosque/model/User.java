package co.edu.unbosque.model;

public abstract class User {

    private long id;
    private String name;
    private String businessName;

    public User() {

    }

    public User(long id, String name, String businessName) {
        super();

        this.id = id;
        this.name = name;
        this.businessName = businessName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "UserDTO [id=" + id + ", name=" + name + ", businessName=" + businessName + "]";
    }

}