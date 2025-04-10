package outrocrud;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PessoalDAO {

    public void inserir(Pessoal pessoa){
        String sql = "INSERT INTO public.pessoa (nome, idade) VALUES(?, ?);";
        try (Connection conn = Conex.conectar();
             PreparedStatement pst = conn.prepareStatement(sql)){
            pst.setString(1,pessoa.getNome());
            pst.setInt(2, pessoa.getIdade());
            pst.execute();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
