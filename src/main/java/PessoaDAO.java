import java.lang.reflect.Executable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO{

    public void inserir(Pessoa p){
        String sql = "INSERT INTO pessoa (nome, idade) VALUES (?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.executeUpdate();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<Pessoa> listar() throws Exception {
        List<Pessoa> pessoas = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";

        try (Connection conn = Conexao.conectar();
             Statement pst = conn.createStatement();
             ResultSet rs = pst.executeQuery(sql)) {

            while (rs.next()) {
                Pessoa p = new Pessoa(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade")
                );
                pessoas.add(p);
            }
        }

        return pessoas;
    }

    public void atualizar(Pessoa p) throws Exception {
        String sql = "UPDATE pessoa SET nome = ?, idade = ? WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.setInt(3, p.getId());
            pst.executeUpdate();
        }
    }

    public void deletar(int id) throws Exception {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
}
