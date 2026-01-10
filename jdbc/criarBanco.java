

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class criarBanco {

    public static void main(String[] args) throws SQLException{
        
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=false"; 
        final String usuario = "root";
        final String senha = "Pietro@2026";

        Connection conexao = (Connection) DriverManager
        .getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        //stmt.execute("DROP DATABASE IF EXISTS jdbc_2");
        stmt.execute("CREATE DATABASE IF NOT EXISTS jdbc");

        System.out.println("Banco criado com sucesso!");
        conexao.close();
    }

}
