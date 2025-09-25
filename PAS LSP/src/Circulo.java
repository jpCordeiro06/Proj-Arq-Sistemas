public class Circulo extends FormaGeometrica{

    public int raio;

    public Circulo(int raio){
        this.raio = raio;
    }

    public void calculaArea(){
        double area = 3.14 * (raio * raio);
        System.out.println("A área do circulo é: "+ area);
    }
}
