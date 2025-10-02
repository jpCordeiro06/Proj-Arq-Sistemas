package Builder;

public interface Builder {
    Builder comPortas(int portas);
    Builder comTetoSolar(boolean tetoSolar);
    Carro build();
}