import java.util.List;

public class Cadastrar {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();

        try {
            // Criar
            Pessoa pessoa = new Pessoa();
            pessoa.setNome("Anderoso Gamdex");
            pessoa.setIdade(27);
            dao.inserir(pessoa);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    }

