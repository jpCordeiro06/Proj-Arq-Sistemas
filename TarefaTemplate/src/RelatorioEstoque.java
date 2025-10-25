import java.util.*;

public class RelatorioEstoque extends GeradorRelatorio {

    @Override
    protected String getNomeRelatorio() {
        return "RELATÓRIO DE ESTOQUE";
    }

    @Override
    protected List<String> carregarDados() {
        System.out.println("Carregando dados de estoque...");
        List<String> estoque = new ArrayList<>();
        estoque.add("Notebook: 3 unidades");
        estoque.add("Mouse: 50 unidades");
        estoque.add("Teclado: 8 unidades");
        return estoque;
    }

    @Override
    protected List<String> filtrarDados(List<String> dados) {
        System.out.println("Filtrando produtos com estoque baixo");
        List<String> filtrados = new ArrayList<>();
        for (String item : dados) {
            if (!item.contains("Mouse")) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    @Override
    protected List<String> ordenarDados(List<String> dados) {
        System.out.println("Ordenando por quantidade (menor → maior)");
        Collections.sort(dados);
        return dados;
    }

    @Override
    protected void formatarDados(List<String> dados) {
        System.out.println("\nEstoque Baixo:");
        for (String item : dados) {
            System.out.println("⚠ " + item);
        }
    }
}