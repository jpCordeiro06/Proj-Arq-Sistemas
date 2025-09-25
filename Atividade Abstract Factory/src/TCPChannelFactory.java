public class TCPChannelFactory extends ChannelFactory{
    public Channel createChannel() {
        return new TCPChannel();
    }
}
