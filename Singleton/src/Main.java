public class Main {
    public static void main(String[] args) {

        dbconn db = dbconn.getInstance();
        db.conectar("Conectando ao MySQL");
    }
}
