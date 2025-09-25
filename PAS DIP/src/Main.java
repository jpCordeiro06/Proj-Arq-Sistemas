public class Main {
    public static void main(String[] args) {
        Connection c1 = new PostgreSQL();
        LembraSenha senha = new LembraSenha(c1);

        senha.getConnection();
    }
}
