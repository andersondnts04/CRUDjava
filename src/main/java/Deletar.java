public class Deletar {
    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();

        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setId(3);
            dao.deletar(pessoa);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
