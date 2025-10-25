public class ConexaoPostgreSQL implements Conexao{
    public void conectar() {
        System.out.println("Conectando ao PostgreSQL...");
        System.out.println("Porta padrão: 5432");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do PostgreSQL...");
    }

    @Override
    public String getTipo() {
        return "PostgreSQL";
    }
}
