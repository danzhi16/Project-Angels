package Data;

import java.sql.Connection;


public interface IDB {
    Connection getConnection();
    void closeConnection();
}
