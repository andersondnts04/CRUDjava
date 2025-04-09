package meuCRUD;
//por enquanto so tem o insert
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO1 {

    public void inserir(Pessoa pessoa){
        String sql = "INSERT INTO pessoa (nome, idade) VALUES (?, ?)";

        try (Connection conn = Conexao1.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1,pessoa.getNome());
            pst.setInt(2,pessoa.getIdade());
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
