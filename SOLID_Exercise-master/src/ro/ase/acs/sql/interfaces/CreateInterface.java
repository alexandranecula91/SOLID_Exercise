package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateInterface {
    void createTable(Connection connection) throws SQLException;
}
