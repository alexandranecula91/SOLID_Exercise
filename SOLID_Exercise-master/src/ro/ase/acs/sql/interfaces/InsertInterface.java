package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface InsertInterface {
    void insertData(Connection connection) throws SQLException;
}
