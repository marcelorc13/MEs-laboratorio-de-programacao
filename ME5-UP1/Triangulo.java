
public class Triangulo implements FormaGeometrica {

    public double base;
    public double altura;
    public double[] lados;
    private double area;
    private double perimetro;
    private String tipo;

    public Triangulo(double t_base, double t_altura) {
        this.base = t_base;
        this.altura = t_altura;
        this.lados = new double[3];
    }

    public void inserirLados(double l1, double l2, double l3) {
        this.lados[0] = l1;
        this.lados[1] = l2;
        this.lados[2] = l3;
    }

    public void exibirLados() {
        for (int i = 0; i < lados.length; i++) {
            System.out.println("Lado " + (i + 1) + ": " + lados[i]);
        }
    }

    @Override
    public double calcularArea() {
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        for (int i = 0; i < lados.length; i++) {
            perimetro += lados[i];
        }
        return perimetro;
    }

    public void classificarTriangulo() {
        if (lados[0] == lados[1] && lados[1] == lados[2]) {
            tipo = "Equilatero";
        } else if (lados[0] != lados[1] && lados[1] != lados[2] && lados[0] != lados[2]) {
            tipo = "Escaleno";
        } else {
            tipo = "Isoceles";
        }
    }

    public void exibirTriangulo() {
        System.out.println("-Triangulo-\n");
        exibirLados();
        System.out.println("\nBase: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("\nArea: " + area);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Tipo: " + tipo);
    }

    public static void main(String args[]) {
        Triangulo t = new Triangulo(10, 5);
        t.inserirLados(5, 4, 5);
        t.calcularArea();
        t.calcularPerimetro();
        t.classificarTriangulo();
        t.exibirTriangulo();
    }
}
