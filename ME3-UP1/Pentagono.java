
public class Pentagono {

    public double lado;
    public double apotema;
    private double area;
    private double perimetro;

    public Pentagono(double p_lado) {
        this.lado = p_lado;
    }

    public void calcularPerimetro() {
        for (int i = 0; i < 5; i++) {
            perimetro += lado;
        }
    }

    public void calcularApotema() {
        apotema = (lado / 2) * (1 / Math.tan(Math.PI / 5));
    }

    public void calcularArea() {
        area = (perimetro * apotema) / 2;
    }

    public void exibirPentagono() {
        System.out.println("-Pentagono-\n");
        System.out.println("Lado: " + lado);
        System.out.println("Apotema: " + apotema);
        System.out.println("\nArea: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void main(String args[]) {
        Pentagono p = new Pentagono(5);
        p.calcularPerimetro();
        p.calcularApotema();
        p.calcularArea();
        p.exibirPentagono();
    }
}
