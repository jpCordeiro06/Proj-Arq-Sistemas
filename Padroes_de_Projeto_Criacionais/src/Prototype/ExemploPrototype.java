package Prototype;

public class ExemploPrototype {
    public static void main(String[] args) {
        Circulo circuloOriginal = new Circulo("Azul", 10);
        circuloOriginal.desenhar();

        System.out.println("-------------------------");

        Circulo circuloClone1 = (Circulo) circuloOriginal.clone();
        circuloClone1.desenhar();

        Circulo circuloClone2 = (Circulo) circuloOriginal.clone();
        circuloClone2.setRaio(25);
        circuloClone2.desenhar();
    }
}