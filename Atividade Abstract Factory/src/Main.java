public class Main {
    public static void main(String[] args) {
        ChannelFactory tcpFactory = new TCPChannelFactory();
        ChannelFactory udpFactory = new UDPChannelFactory();

        Teste1 t1 = new Teste1(tcpFactory);

        Teste2 t2 = new Teste2(udpFactory);
        Teste3 t3 = new Teste3(udpFactory);

        t1.conectar();
        t2.conectar();
        t3.conectar();
    }
}