import java.util.*;

abstract class GeradorRelatorio {

    protected List<String> dados;

    public final void gerarRelatorio() {
        System.out.println("\n=== " + getNomeRelatorio() + " ===\n");

        dados = carregarDados();
        dados = filtrarDados(dados);
        dados = ordenarDados(dados);
        formatarDados(dados);

        System.out.println("\n=== Concluído ===\n");
    }

    protected abstract String getNomeRelatorio();
    protected abstract List<String> carregarDados();
    protected abstract List<String> filtrarDados(List<String> dados);
    protected abstract List<String> ordenarDados(List<String> dados);
    protected abstract void formatarDados(List<String> dados);
}