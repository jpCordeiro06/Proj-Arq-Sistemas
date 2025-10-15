public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    public void send(String message) {
        System.out.println("[BufferChannel] Armazenando no buffer...");
        super.send(message);
    }

    public String receive() {
        System.out.println("[BufferChannel] Lendo do buffer...");
        return super.receive();
    }
}
