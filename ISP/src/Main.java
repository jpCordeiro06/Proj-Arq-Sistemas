public class Main {
    public static void main(String[] args) {
        PersistenciaDB banco = new BancoDados();
        banco.save();
        banco.insert();
        banco.delete();
    }
}
