
public class Heptagono implements FormaGeometrica {

    public double lado;
    public double apotema;
    private double area;
    private double perimetro;

    public Heptagono(double p_lado) {
        this.lado = p_lado;
    }

    @Override
    public double calcularPerimetro() {
        for (int i = 0; i < 6; i++) {
            perimetro += lado;
        }
        return perimetro;
    }

    public void calcularApotema() {
        apotema = (lado / 2) * (1 / Math.tan(Math.PI / 7));
    }

    @Override
    public double calcularArea() {
        area = (perimetro * apotema) / 2;
        return area;
    }

    public void exibirHeptagono() {
        System.out.println("-Heptagono-\n");
        System.out.println("Lado: " + lado);
        System.out.println("\nArea: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void main(String args[]) {
        Heptagono h = new Heptagono(5);
        h.calcularPerimetro();
        h.calcularApotema();
        h.calcularArea();
        h.exibirHeptagono();
    }
}
