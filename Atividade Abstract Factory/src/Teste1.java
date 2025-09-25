public class Teste1 {
    private Channel ch;

    public Teste1(ChannelFactory factory){
        this.ch = factory.createChannel();
    }

    public void conectar() {
        this.ch.getMessage();
    }
}
