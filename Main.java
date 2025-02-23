import controllers.ProductController;
import controllers.UserController;
import controllers.interfaces.IProductController;
import controllers.interfaces.IUserController;
import Data.PostgresDB;
import Data.Interfaces.IDB;
import repositories.ProductRepository;
import repositories.UserRepository;
import repositories.interfaces.IProductRepository;
import repositories.interfaces.IUserRepository;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB("jdbc:postgresql://localhost:5432", "postgres", "290607", "postgres");

        IUserRepository user_repo = new UserRepository(db);
        IUserController user_controller = new UserController(user_repo);
        IProductRepository product_repo = new ProductRepository(db);
        IProductController product_controller = new ProductController(product_repo);
        MyApplication app = new MyApplication(user_controller, product_controller);
        app.start();
        db.close();
    }
}