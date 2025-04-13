package outrocrud;

public class Cadastrando {
    public static void main(String[] args) {
        PessoalDAO Dao = new PessoalDAO();

        try {
            Pessoal pessoa = new Pessoal();
            pessoa.setNome("Julio Cesar Augusto");
            pessoa.setIdade(34);
            Dao.inserir(pessoa);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        }
}
