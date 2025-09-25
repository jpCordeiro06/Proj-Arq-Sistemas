public class Teste2 {
    private Channel ch;

    public Teste2(ChannelFactory factory){
        this.ch = factory.createChannel();
    }

    public void conectar() {
        this.ch.getMessage();
    }
}
