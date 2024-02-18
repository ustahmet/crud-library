package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crud {
    DbHelper helper = new DbHelper();
    public void selectOperator() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select book_id, name, writer, language, page_number, pub_date, pub_number, print_house from books");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }

        }catch (SQLException exception) {
            helper.showErrorMessage(exception);

        }
        finally {
            connection.close();
        }

    }

    public void insertOperator() throws SQLException {

    }

}
