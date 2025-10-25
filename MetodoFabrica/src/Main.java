import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("  SISTEMA DE CONEXÕES DE BANCO DE DADOS");

        // Criar fábricas
        FabricaConexao fabricaMySQL = new FabricaMySQL();
        FabricaConexao fabricaOracle = new FabricaOracle();
        FabricaConexao fabricaPostgres = new FabricaPostgreSQL();

        // Executar conexões
        fabricaOracle.executarConexao();
        fabricaPostgres.executarConexao();
        fabricaMySQL.executarConexao();

        // Alternativa: criando conexões diretamente
        System.out.println("  CRIANDO CONEXÕES DIRETAMENTE");

        List<Conexao> conexoes = new ArrayList<>();
        conexoes.add(new ConexaoOracle());
        conexoes.add(new ConexaoPostgreSQL());
        conexoes.add(new ConexaoMySQL());

        for (Conexao conexao : conexoes) {
            System.out.println("Tipo de Conexão: " + conexao.getTipo());
            conexao.conectar();
            System.out.println();
        }
    }
}