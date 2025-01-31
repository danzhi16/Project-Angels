package models;

public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String surname;
    private boolean gender;

    public User(String username, String password, String name, String surname, boolean gender) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public User(int id, String username, String password, String name, String surname, boolean gender) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + (gender ? "Male" : "Female") + '}';
    }
}