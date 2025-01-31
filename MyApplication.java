import controllers.interfaces.IUserController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final IUserController userController;
    private final Scanner scanner = new Scanner(System.in);

    public MyApplication(IUserController userController) {
        this.userController = userController;
    }

    public void start() {
        while (true) {
            try{
                System.out.println("Welcome to Tea store DB!");
                System.out.println("Select an option:");
                System.out.println("1. Log in as admin");
                System.out.println("2. Log in as user");
                System.out.println("0. Exit");
                int option = scanner.nextInt();
                switch (option) {
                    case 1: AdminMenu(); break;
                    case 2: UserMenu(); break;
                    default: return;
                }
            }catch (InputMismatchException e) {
                System.out.println("Input must be number");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private void AdminMenu(){
        System.out.println("Select an option:");
        System.out.println("1. Log in as admin");
        System.out.println("2. Log in as user");
        System.out.println("0. Exit");
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1: getUserByIdMenu(); break;
                case 2 : deleteUserMenu(); break;
                default: return;
            }
        }catch (InputMismatchException e) {
            System.out.println("Input must be number");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void UserMenu(){
        System.out.println("Select an option:");
        System.out.println("1. Log in as admin");
        System.out.println("2. Log in as user");
        System.out.println("0. Exit");
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1: createUserMenu(); break;
                case 2 : getAllUsersMenu(); break;
                default: return;
            }
        }catch (InputMismatchException e) {
            System.out.println("Input must be number");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void createUserMenu() {
        System.out.println("Please enter a user name: ");
        String name = scanner.next();
        System.out.println("Please enter a surname: ");
        String surname = scanner.next();
        System.out.println("Please enter a gender: ");
        String gender = scanner.next();
        String response = userController.createUser(name, surname, gender);
        System.out.println(response);
    }

    private void getUserByIdMenu() {
        System.out.println("Enter user id");
        int id = scanner.nextInt();
        String response = userController.getUserById(id);
        System.out.println(response);
    }

    private void getAllUsersMenu() {
        String response = userController.getAllUsers();
        System.out.println(response);
    }

    private void ListOfGoodsMenu() {
        String response = userController.getAllUsers();
        System.out.println(response);
    }

    private void deleteUserMenu() {
        String response = userController.getAllUsers();
        System.out.println(response);
    }

    private void mainMenu() {
        System.out.println();
        System.out.println("Welcome to Tea store DB!");
        System.out.println("Select an option:");
        System.out.println("1. Get all users");
        System.out.println("2. Get user by id");
        System.out.println("3. Create a new user");
        System.out.println("4. Delete user (in progress)");
        System.out.println("5. List of goods (in progress)");
        System.out.println("0. Exit");
        System.out.print("Enter option (1-3): ");
    }
}