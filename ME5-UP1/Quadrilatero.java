
public class Quadrilatero implements FormaGeometrica {

    public double base;
    public double altura;
    public double[] lados;
    private double area;
    private double perimetro;

    public Quadrilatero(double q_base, double q_altura) {
        this.base = q_base;
        this.altura = q_altura;
        this.lados = new double[4];
    }

    public void inserirLados(double l1, double l2, double l3, double l4) {
        this.lados[0] = l1;
        this.lados[1] = l2;
        this.lados[2] = l3;
        this.lados[3] = l4;
    }

    public void exibirLados() {
        for (int i = 0; i < lados.length; i++) {
            System.out.println("Lado " + (i + 1) + ": " + lados[i]);
        }
    }

    @Override
    public double calcularPerimetro() {
        for (int i = 0; i < lados.length; i++) {
            perimetro += lados[i];
        }
        return perimetro;
    }

    @Override
    public double calcularArea() {
        area = base * altura;
        return area;
    }

    public void exibirQuadrilatero() {
        System.out.println("-Quadrilatero-\n");
        exibirLados();
        System.out.println("\nBase: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("\nArea: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    public static void main(String args[]) {
        Quadrilatero q = new Quadrilatero(10, 5);
        q.inserirLados(10, 5, 5, 10);
        q.calcularPerimetro();
        q.calcularArea();
        q.exibirQuadrilatero();
    }
}
