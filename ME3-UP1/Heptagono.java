
public class Heptagono {

    public double lado;
    public double apotema;
    private double area;
    private double perimetro;

    public Heptagono(double p_lado) {
        this.lado = p_lado;
    }

    public void calcularPerimetro() {
        for (int i = 0; i < 6; i++) {
            perimetro += lado;
        }
    }

    public void calcularApotema() {
        apotema = (lado / 2) * (1 / Math.tan(Math.PI / 7));
    }

    public void calcularArea() {
        area = (perimetro * apotema) / 2;
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
