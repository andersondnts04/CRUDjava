package CRUD;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao1 {
    private static final String URL= "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "andersondantas";


    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        return null;
        }
    }
}
