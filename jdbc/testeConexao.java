
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testeConexao {

    public static void main(String[] args) throws SQLException {
       final String url = "jdbc:mysql://localhost"; 
       final String usuario = "root";
       final String senha = "Pietro@2026";

       Connection conexao = DriverManager
       .getConnection(url, usuario, senha);

       System.out.println("Conexão efetuada com sucesso!");
       conexao.close();
    }

}
