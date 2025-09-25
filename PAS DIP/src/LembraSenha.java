public class LembraSenha {

    private Connection conexao;

    public LembraSenha(Connection con) {
        conexao = con;
    }

    public void getConnection() {
        this.conexao.conectar();
    }
}
