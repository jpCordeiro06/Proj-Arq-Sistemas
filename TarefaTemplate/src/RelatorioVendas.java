import java.util.*;

public class RelatorioVendas extends GeradorRelatorio {

    protected String getNomeRelatorio() {
        return "RELATÓRIO DE VENDAS";
    }

    protected List<String> carregarDados() {
        System.out.println("Carregando dados de vendas...");
        List<String> vendas = new ArrayList<>();
        vendas.add("Notebook: R$ 3500");
        vendas.add("Mouse: R$ 50");
        vendas.add("Teclado: R$ 150");
        return vendas;
    }

    protected List<String> filtrarDados(List<String> dados) {
        System.out.println("Filtrando vendas acima de R$ 100");
        List<String> filtrados = new ArrayList<>();
        for (String item : dados) {
            if (!item.contains("Mouse")) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    protected List<String> ordenarDados(List<String> dados) {
        System.out.println("Ordenando por valor (maior → menor)");
        Collections.reverse(dados);
        return dados;
    }

    protected void formatarDados(List<String> dados) {
        System.out.println("\nProdutos:");
        for (String item : dados) {
            System.out.println("- " + item);
        }
    }
}