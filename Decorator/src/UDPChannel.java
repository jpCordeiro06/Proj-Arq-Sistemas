public class UDPChannel implements Channel {

    public void send(String message) {
        System.out.println("UDPChannel enviando: " + message);
    }

    public String receive() {
        return "Mensagem recebida via UDPChannel";
    }
}
