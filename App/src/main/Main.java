package main;

import database.controller.ClubController;
import database.connection.ConnectionPool;
import gui.window.MenuWindow;
import model.Club;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        new MenuWindow();

        ArrayList<Club> clubs = ClubController.getClubs();
        for (Club c : clubs)
            System.out.println(c.toString());

        // test();
    }

    private static void test() {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = ConnectionPool.getInstance().checkOut();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM drzava");

            while (resultSet.next())
                System.out.println(resultSet.getString(2));

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null)
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            ConnectionPool.getInstance().checkIn(connection);
        }
    }
}
