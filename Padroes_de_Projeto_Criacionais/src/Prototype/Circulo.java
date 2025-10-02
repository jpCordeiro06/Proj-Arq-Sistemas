package Prototype;

class Circulo implements Forma {
    private String cor;
    private int raio;

    public Circulo(String cor, int raio) {
        this.cor = cor;
        this.raio = raio;
        System.out.println("Criando um círculo do zero.");
    }

    private Circulo(Circulo prototipo) {
        this.cor = prototipo.cor;
        this.raio = prototipo.raio;
    }

    public Forma clone() {
        System.out.println("Clonando um círculo existente.");
        return new Circulo(this);
    }

    public void desenhar() {
        System.out.println("Círculo desenhado: cor=" + this.cor + ", raio=" + this.raio);
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}