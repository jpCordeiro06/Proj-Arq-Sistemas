public class Main {
    public static void main(String[] args) {

        Folha f1 = new Folha();
        Pagamento c1 = new Contrato(2500.0f);
        Pagamento e1 = new Estagio(900.0f);
        Pagamento clt1 = new CLT(5000.0f);

        f1.add(e1);
        f1.add(clt1);
        f1.add(c1);

        System.out.println("Saldo atualizado: " + f1.getSaldo());
    }
}
