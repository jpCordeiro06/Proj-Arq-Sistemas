public class FabricaPostgreSQL extends FabricaConexao{
    public Conexao criarConexao() {
        return new ConexaoPostgreSQL();
    }
}
