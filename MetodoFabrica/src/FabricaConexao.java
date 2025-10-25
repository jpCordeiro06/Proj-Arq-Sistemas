abstract class FabricaConexao {
    public abstract Conexao criarConexao();

    public void executarConexao() {
        Conexao conexao = criarConexao();
        System.out.println("\n=== Tipo: " + conexao.getTipo() + " ===");
        conexao.conectar();
        conexao.desconectar();
        System.out.println();
    }
}
