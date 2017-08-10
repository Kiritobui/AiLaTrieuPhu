package player;

import java.sql.*;

public class Database {
    private Connection connect;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection success!");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Connection fail");
        }
        String url = "jdbc:mysql://localhost/ailatrieuphu?useUnicode=true&characterEncoding=UTF-8";
        try{
            connect = (Connection) DriverManager.getConnection(url,"root","");
            //System.out.println("Database connected");
        }catch(SQLException se){
            //System.out.println("No database");
        }
        return connect;
    }
}