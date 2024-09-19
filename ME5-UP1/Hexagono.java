
public class Hexagono implements FormaGeometrica {

    public double lado;
    private double area;
    private double perimetro;

    public Hexagono(double p_lado) {
        this.lado = p_lado;
    }

    @Override
    public double calcularPerimetro() {
        for (int i = 0; i < 6; i++) {
            perimetro += lado;
        }
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
        return area;
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
