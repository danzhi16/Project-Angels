import java.util.ArrayList;
import java.util.List;

public class Users {
    private int id;
    private String name;
    private String email;
    private String password;
    private List<String> roles;

    // Default constructor
    public Users() {
        this.roles = new ArrayList<>();
    }

    // Parameterized constructor
    public Users(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    // Add a role to the user
    public void addRole(String role) {
        this.roles.add(role);
    }

    // Remove a role from the user
    public void removeRole(String role) {
        this.roles.remove(role);
    }

    // Check if the user has a specific role
    public boolean hasRole(String role) {
        return this.roles.contains(role);
    }

    // Display user information
    public void displayUserInfo() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Roles: " + roles);
    }

    // Main method for testing
    public static void main(String[] args) {
        Users user = new Users(1, "John Doe", "john.doe@example.com", "password123");
        user.addRole("Admin");
        user.addRole("User");
        user.displayUserInfo();
    }
}