package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost3306/projeto","root","123qwe@");
        }catch(Exception erro){
            throw new RuntimeException(erro);
        }
    }
    
    Connection getConnection(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
