package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_source {
	
	

    public static final String DB_NAME = "demoqa.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:/Users/sami/Desktop/SeleniumBootCamp/DEMOQA/src/data/" + DB_NAME;


    Connection conn = null;

    Statement stmt = null;

    ResultSet resultSet = null;



    /*
    method to open DB connection
        using connection_string
     */
    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }



    public void createStatement(String query) throws SQLException {
        conn = DriverManager.getConnection(CONNECTION_STRING);
        stmt = conn.createStatement();
        resultSet = stmt.executeQuery(query);

    }




    //call the close method after finshing up using the Database
    public void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
            e.printStackTrace();
        }
    }




    //demo qa method
    public void printDBcountryList(String query) throws SQLException {

        createStatement(query);
        System.out.println("***Data from DB***");


        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));

        }

    }


}
