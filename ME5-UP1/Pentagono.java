
public class Pentagono implements FormaGeometrica {

    public double lado;
    public double apotema;
    private double area;
    private double perimetro;

    public Pentagono(double p_lado) {
        this.lado = p_lado;
    }

    @Override
    public double calcularPerimetro() {
        for (int i = 0; i < 5; i++) {
            perimetro += lado;
        }
        return perimetro;
    }

    public void calcularApotema() {
        apotema = (lado / 2) * (1 / Math.tan(Math.PI / 5));
    }

    @Override
    public double calcularArea() {
        area = (perimetro * apotema) / 2;

        return area;
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
