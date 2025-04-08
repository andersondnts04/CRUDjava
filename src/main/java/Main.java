import java.util.List;

public class Main {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();

        try {
            // Criar
            Pessoa pessoa = new Pessoa("Julia", 26);
            dao.inserir(pessoa);

            /* Listar
            List<Pessoa> pessoas = dao.listar();
            for (Pessoa p : pessoas) {
                System.out.println(p.getId() + " - " + p.getNome() + " - " + p.getIdade());
            }

            // Atualizar
            if (!pessoas.isEmpty()) {
                Pessoa p = pessoas.get(0);
                p.setNome("João Atualizado");
                p.setIdade(30);
                dao.atualizar(p);
            }

            // Deletar
            if (!pessoas.isEmpty()) {
                dao.deletar(pessoas.get(0).getId());
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
