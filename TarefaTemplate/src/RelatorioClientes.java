import java.util.*;

public class RelatorioClientes extends GeradorRelatorio {

    protected String getNomeRelatorio() {
        return "RELATÓRIO DE CLIENTES";
    }

    protected List<String> carregarDados() {
        System.out.println("Carregando dados de clientes...");
        List<String> clientes = new ArrayList<>();
        clientes.add("Maria Silva: 15 compras");
        clientes.add("João Santos: 3 compras");
        clientes.add("Ana Costa: 8 compras");
        return clientes;
    }

    protected List<String> filtrarDados(List<String> dados) {
        System.out.println("Filtrando apenas clientes ativos");
        List<String> filtrados = new ArrayList<>();
        for (String item : dados) {
            if (!item.contains("João")) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    protected List<String> ordenarDados(List<String> dados) {
        System.out.println("Ordenando alfabeticamente");
        Collections.sort(dados);
        return dados;
    }

    protected void formatarDados(List<String> dados) {
        System.out.println("\nClientes Ativos:");
        for (String item : dados) {
            System.out.println("👤 " + item);
        }
    }
}