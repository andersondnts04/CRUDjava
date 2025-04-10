package outrocrud;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conex {
    private static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static String USER = "postgres";
    private static String PASSWORD = "andersondantas";

    public static Connection conectar(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
