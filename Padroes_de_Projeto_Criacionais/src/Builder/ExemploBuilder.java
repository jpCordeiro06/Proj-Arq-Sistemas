package Builder;

public class ExemploBuilder {
    public static void main(String[] args) {
        Builder builderCarro = new CarroBuilder("2.0 Turbo", "Azul");

        Carro meuCarro = builderCarro
                .comPortas(4)
                .comTetoSolar(true)
                .build();

        System.out.println(meuCarro);
    }
}