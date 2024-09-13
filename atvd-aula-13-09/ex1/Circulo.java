

public class Circulo implements FormaGeometrica {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double area() {
        return raio * raio;
    }

    @Override
    public double perimetro() {
        return raio * 4;
    }

    public void exibirCirculo() {
        System.out.println("\n---Circulo---");
        System.out.println("Raio: " + getRaio());
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
}
