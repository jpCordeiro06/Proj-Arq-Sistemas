public class main {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(7);

        Retangulo r1 = new Retangulo(5,7);

        FormaGeometrica f1 = (FormaGeometrica) q1;
        FormaGeometrica f2 = (FormaGeometrica) r1;

        FormaGeometrica f3 = new Quadrado(4);
        FormaGeometrica f4 = new Retangulo(7,3);

        FormaGeometrica f5 = new Circulo(5);

        f1.calculaArea();
        f2.calculaArea();
        f3.calculaArea();
        f4.calculaArea();
        f5.calculaArea();
    }
}
