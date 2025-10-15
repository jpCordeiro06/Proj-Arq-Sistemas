public class Main {
    public static void main(String[] args) {
        Channel tcp = new TCPChannel();

        Channel channelDecorado = new LogChannel(
                new BufferChannel(
                        new ZipChannel(tcp)));

        channelDecorado.send("Olá, mundo!");
        System.out.println("Recebido: " + channelDecorado.receive());

        Channel udp = new UDPChannel();

        Channel channelDecorado2 = new LogChannel(
                new BufferChannel(
                        new ZipChannel(udp)));

        channelDecorado2.send("Olá, mundo!");
        System.out.println("Recebido: " + channelDecorado2.receive());
    }
}
