public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    public void send(String message) {
        System.out.println("[LogChannel] Log de envio: " + message);
        super.send(message);
    }

    public String receive() {
        String message = super.receive();
        System.out.println("[LogChannel] Log de recebimento: " + message);
        return message;
    }
}
