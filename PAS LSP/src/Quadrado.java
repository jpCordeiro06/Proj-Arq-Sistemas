public class Quadrado extends FormaGeometrica{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public void calculaArea(){
        int area = this.lado * this.lado;
        System.out.println("A área do quadrado é: "+ area);
    }
}
