public class Teste3 {
    private Channel ch;

    public Teste3(ChannelFactory factory){
        this.ch = factory.createChannel();
    }

    public void conectar() {
        this.ch.getMessage();
    }
}
