public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        String compressed = compress(message);
        System.out.println("[ZipChannel] Mensagem comprimida.");
        super.send(compressed);
    }

    @Override
    public String receive() {
        String message = super.receive();
        return decompress(message);
    }

    private String compress(String data) {
        return "ZIP(" + data + ")";
    }

    private String decompress(String data) {
        return data.replace("ZIP(", "").replace(")", "");
    }
}
