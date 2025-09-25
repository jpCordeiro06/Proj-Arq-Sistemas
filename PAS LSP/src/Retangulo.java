public class Retangulo extends FormaGeometrica {

    private int base, altura;

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calculaArea(){
        int area = this.base * this.altura;
        System.out.println("A área do retângulo é: "+ area);
    }
}
