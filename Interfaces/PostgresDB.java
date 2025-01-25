package Interfaces;

import Data.IDB;

import java.sql.Connection;

public class PostgresDB implements IDB {
    private String host;
    private String username;
    private String password;
    private String dbname;

    private Connection connection;

    private PostgresDB(String host, String username, String password, String dbname) {
        setHost(host);
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void closeConnection() {

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
