package outrocrud;

public class Exec {
    public static void main(String[] args) {
        PessoalDAO pessoal = new PessoalDAO();

        try {
            Pessoal pessoa = new Pessoal();
            pessoa.setNome("Julio Cesar Augusto");
            pessoa.setIdade(34);
            pessoal.inserir(pessoa);
        }catch(Exception ex){
            ex.printStackTrace();
        }

        }
}
