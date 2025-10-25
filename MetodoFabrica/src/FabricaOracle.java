public class FabricaOracle extends FabricaConexao {
    public Conexao criarConexao() {
        return new ConexaoOracle();
    }
}
