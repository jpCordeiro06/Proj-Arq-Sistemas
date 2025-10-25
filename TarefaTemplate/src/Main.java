public class Main {
    public static void main(String[] args) {

        GeradorRelatorio vendas = new RelatorioVendas();
        vendas.gerarRelatorio();

        GeradorRelatorio estoque = new RelatorioEstoque();
        estoque.gerarRelatorio();

        GeradorRelatorio clientes = new RelatorioClientes();
        clientes.gerarRelatorio();
    }
}