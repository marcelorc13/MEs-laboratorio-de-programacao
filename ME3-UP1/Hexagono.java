
public class Hexagono {

    public double lado;
    private double area;
    private double perimetro;

    public Hexagono(double p_lado) {
        this.lado = p_lado;
    }

    public void calcularPerimetro() {
        for (int i = 0; i < 6; i++) {
            perimetro += lado;
        }
    }

    public void calcularArea() {
        area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    public void exibirHexagono() {
        System.out.println("-Hexagono-\n");
        System.out.println("Lado: " + lado);
        System.out.println("\nArea: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void main(String args[]) {
        Hexagono h = new Hexagono(5);
        h.calcularPerimetro();
        h.calcularArea();
        h.exibirHexagono();
    }
}
