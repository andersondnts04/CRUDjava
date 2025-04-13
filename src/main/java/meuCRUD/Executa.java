package meuCRUD;

public class Cadastra {
    public static void main(String[] args) {
        PessoaDAO1 dao = new PessoaDAO1();

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
