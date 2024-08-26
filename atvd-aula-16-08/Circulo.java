
public class Circulo {

    private double raio;
    private double diametro;
    private double area;
    private double perimetro;

    double pi = Math.PI;

    public void setRaio(double r) {
        raio = r;
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        diametro = raio * 2;
        return diametro;
    }

    public double getArea() {
        area = pi * Math.pow(raio, 2);
        return area;
    }

    public double getPerimetro() {
        perimetro = 2 * pi * raio;
        return perimetro;
    }

    public void exibeDados() {
        if (raio == 0) {
            System.out.println("Insira um valor para o Raio!");
        } else {
            System.out.println();
            System.out.println("-Informacoes desse circulo-");
            System.out.println("Raio: " + getRaio());
            System.out.println("Diametro: " + getDiametro());
            System.out.println("Area: " + getArea());
            System.out.println("Perimetro: " + getPerimetro());
            System.out.println();
        }
    }
}
