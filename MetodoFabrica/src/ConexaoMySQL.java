public class ConexaoMySQL implements Conexao{
    public void conectar() {
        System.out.println("Conectando ao MySQL...");
        System.out.println("Porta padrão: 3306");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do MySQL...");
    }

    @Override
    public String getTipo() {
        return "MySQL";
    }
}
