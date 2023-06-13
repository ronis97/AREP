package edu.eci.arep.project.trafficApi.persistence.connection;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    private static final Object mutex = new Object();
    private static volatile BasicDataSource dataSourceInstance;
    private static final String CONNECTION_DATABASE;
    private static final String CONNECTION_USER;
    private static final String CONNECTION_PASSWD;
    private static final String JDBC_CONNECTION_URL;

    static {
        CONNECTION_DATABASE = "trafficApi";
        CONNECTION_USER = "root";
        CONNECTION_PASSWD = "root";
        JDBC_CONNECTION_URL = "jdbc:mysql://localhost:3306/" + CONNECTION_DATABASE +
                "?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    }

    private DBConnection() {}

    private static DataSource getDataSource() {
        BasicDataSource result = dataSourceInstance;
        synchronized (mutex) {
            if (result == null) {
                synchronized (mutex) {
                    result = dataSourceInstance;
                    if (result == null) dataSourceInstance = result = buildNewDataSource();
                }
            }
            return dataSourceInstance;
        }
    }

    private static BasicDataSource buildNewDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(JDBC_CONNECTION_URL);
        dataSource.setUsername(CONNECTION_USER);
        dataSource.setPassword(CONNECTION_PASSWD);
        // Setting the initial size of the Connection Pool
        dataSource.setInitialSize(10);
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}