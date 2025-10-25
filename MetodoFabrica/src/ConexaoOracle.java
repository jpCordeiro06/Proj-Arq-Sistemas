public class ConexaoOracle implements Conexao{
    public void conectar() {
        System.out.println("Conectando ao Oracle Database...");
        System.out.println("Porta padrão: 1521");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do Oracle Database...");
    }

    @Override
    public String getTipo() {
        return "Oracle Database";
    }
}
