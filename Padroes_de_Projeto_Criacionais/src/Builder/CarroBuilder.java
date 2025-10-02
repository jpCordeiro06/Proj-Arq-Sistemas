// CarroBuilder.java
package Builder;

public class CarroBuilder implements Builder { // <-- Mudança aqui
    // Atributos obrigatórios
    private final String motor;
    private final String cor;

    // Atributos opcionais com valores padrão
    private int numeroDePortas = 4;
    private boolean temTetoSolar = false;

    public CarroBuilder(String motor, String cor) {
        this.motor = motor;
        this.cor = cor;
    }

    @Override
    public Builder comPortas(int portas) { // <-- Retorno atualizado para a interface
        this.numeroDePortas = portas;
        return this;
    }

    @Override
    public Builder comTetoSolar(boolean tetoSolar) { // <-- Retorno atualizado para a interface
        this.temTetoSolar = tetoSolar;
        return this;
    }

    @Override
    public Carro build() {
        return new Carro(this);
    }

    // Getters para a classe Carro usar
    public String getMotor() { return motor; }
    public String getCor() { return cor; }
    public int getNumeroDePortas() { return numeroDePortas; }
    public boolean getTemTetoSolar() { return temTetoSolar; }
}