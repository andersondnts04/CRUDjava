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
            pst.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void atualizarPessoa(Pessoa pessoa) {
        String sql = "UPDATE pessoa SET nome = ?, idade = ? WHERE id = ?";


        try ( Connection conn = Conexao.conectar();
            PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1, pessoa.getNome());
            pst.setInt(2, pessoa.getIdade());
            pst.setInt(3, pessoa.getId());

            pst.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deletar(Pessoa pessoa) throws Exception {
        String sql = "DELETE FROM pessoa WHERE id = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, pessoa.getId());
            pst.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public List<Pessoa> listarTodos() {
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";

        try (Connection conn = Conexao.conectar();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet resultado = pst.executeQuery()) {

            while (resultado.next()) {
                Pessoa p = new Pessoa();
                p.setId(resultado.getInt("id"));
                p.setNome(resultado.getString("nome"));
                p.setIdade(resultado.getInt("idade"));
                lista.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
