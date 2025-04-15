public class Update {

    public static void main(String[] args) {
        PessoaDAO dao = new PessoaDAO();
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setId(1);
            pessoa.setNome("jose alberto freitas");
            pessoa.setIdade(40);
            dao.atualizarPessoa(pessoa);

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
