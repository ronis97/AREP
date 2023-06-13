package edu.escuelaing.AREP;

import java.sql.*;
import java.util.ArrayList;

public class DBConnection {

    private static String urlDB = "jdbc:postgresql://postgres://sstqiwrxingora:cfc8cd465538b502a4628cc06270e4532591e9134250aea8805eae60d6808423@ec2-107-23-76-12.compute-1.amazonaws.com:5432/d72uhklq3a88tk";
    private static String usuarioDB = "sstqiwrxingora";
    private static String passwordDB = "cfc8cd465538b502a4628cc06270e4532591e9134250aea8805eae60d6808423";
    private static Connection connection = null;

    public DBConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urlDB, usuarioDB, passwordDB);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(){
        String CREATE_TABLE="CREATE TABLE Personas ("
                + "Cedula Numeric(15) NOT NULL,"
                + "Nombres VARCHAR(60) NOT NULL,"
                + "Apellidos VARCHAR(60) NOT NULL,"
                + "PRIMARY KEY (Cedula))";

        try {
            Statement stmnt = connection.createStatement();
            stmnt.executeQuery(CREATE_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String[]> getInformation(){
        ArrayList<String[]> list = new ArrayList<>();
        String select = "SELECT * FROM Information;";
        try {

            Statement statement = connection.createStatement();
            ResultSet rs =statement.executeQuery(select);
            while(rs.next()){
                String usern = rs.getString("usern");
                String address = rs.getString("address");
                String[] tmp = {usern,address};
                list.add(tmp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}