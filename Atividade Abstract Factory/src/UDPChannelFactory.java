public class UDPChannelFactory extends ChannelFactory{
    public Channel createChannel() {
        return new UDPChannel();
    }
}
