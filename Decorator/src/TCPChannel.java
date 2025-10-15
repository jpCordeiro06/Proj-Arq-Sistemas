public class TCPChannel implements Channel {


    public void send(String message) {
        System.out.println("TCPChannel enviando: " + message);
    }

    public String receive() {
        return "Mensagem recebida via TCPChannel";
    }
}
