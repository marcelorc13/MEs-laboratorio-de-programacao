
public class Quadrado implements FormaGeometrica {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    public void exibirQuadrado() {
        System.out.println("\n---Quadrado---"); 
        System.out.println("Lado: " + getLado());
        System.out.println("Area: " + area());
        System.out.println("Perimetro: " + perimetro());
    }
}
