public class FabricaMySQL extends FabricaConexao {
    public Conexao criarConexao() {
        return new ConexaoMySQL();
    }
}
