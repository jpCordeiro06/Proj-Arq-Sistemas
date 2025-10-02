// Carro.java
package Builder;

class Carro {
    private String motor;
    private String cor;
    private int numeroDePortas;
    private boolean temTetoSolar;

    Carro(CarroBuilder builder) {
        this.motor = builder.getMotor();
        this.cor = builder.getCor();
        this.numeroDePortas = builder.getNumeroDePortas();
        this.temTetoSolar = builder.getTemTetoSolar();
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + ", cor=" + cor + ", portas=" +
                numeroDePortas + ", tetoSolar=" + temTetoSolar + "]";
    }
}