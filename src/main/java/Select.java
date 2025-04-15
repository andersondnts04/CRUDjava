import java.util.List;

public class Select {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        List<Pessoa> pessoas = dao.listarTodos();

        for (Pessoa p : pessoas) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("--------------");
        }
    }
}
