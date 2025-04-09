package CRUD;

public class Executa {
    public static void main(String[] args) {
        DAO dao = new DAO();

        try {
            Pessoa pessoa = new Pessoa();

            pessoa.setNome("Alfredo");
            pessoa.setIdade(30);
            dao.inserir(pessoa);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
