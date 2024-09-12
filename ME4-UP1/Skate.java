
import java.util.Random;

public class Skate extends Veiculo {

    private double tamanhoShape;
    private String truck;
    private String rolamento;
    private double tamanhoRoda;
    private String lixa;

    public Skate(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, double tamanhoShape, String truck, String rolamento, double tamanhoRoda, String lixa) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.tamanhoShape = tamanhoShape;
        this.truck = truck;
        this.rolamento = rolamento;
        this.tamanhoRoda = tamanhoRoda;
        this.lixa = lixa;
    }

    public void setTamanhoShape(double tamanhoShape) {
        this.tamanhoShape = tamanhoShape;
    }

    public double getTamanhoShape() {
        return this.tamanhoShape;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public String getTruck() {
        return this.truck;
    }

    public void setRolamento(String rolamento) {
        this.rolamento = rolamento;
    }

    public String getRolamento() {
        return this.rolamento;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public double getTamanhoRoda() {
        return this.tamanhoRoda;
    }

    public void setLixa(String lixa) {
        this.lixa = lixa;
    }

    public String getLixa() {
        return this.lixa;
    }

    public void dropar() {
        System.out.println("\nDescendo a rampa em velocidade");
    }

    public void remar() {
        System.out.println("\nPuxando com uma perna o skate para ter mais velocidade");
    }

    public boolean fazerManobra(String manobra) {
        System.out.println("\nVoce tenta fazer um " + manobra + " ...");
        Random random = new Random();
        boolean randomBool = random.nextBoolean();
        if (randomBool) {
            System.out.println("E voce conseguiu, que radical!");
        } else {
            System.out.println("Porem voce caiu :(");
        }
        return randomBool;
    }

    public void frear() {
        System.out.println("\nFreando o skate");
    }

    public void exibirSkate() {
        System.out.println("\n-Skate-");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("Valor: " + getValor());
        System.out.println("Tamanho do Shape: " + getTamanhoShape());
        System.out.println("Truck: " + getTruck());
        System.out.println("Rolamento: " + getRolamento());
        System.out.println("Tamanho da Roda: " + getTamanhoRoda() + "mm");
        System.out.println("Lixa: " + getLixa());

    }

    public static void main(String args[]) {
        Skate skate1 = new Skate("Element", "Street", 2024, 40, 700, 8.0, "Independent", "Red Bones", 53, "Grizzly");
        Skate skate2 = new Skate("Santa Cruz", "LongBoard", 2024, 40, 700, 10, "Independent", "ABEC-12", 60, "Nacional");

        skate1.exibirSkate();
        skate1.dropar();
        skate1.remar();
        if(skate1.fazerManobra("Half Cab")) {
            skate1.frear();
        }

        skate2.exibirSkate();
        skate2.dropar();
        skate2.remar();
        if (skate2.fazerManobra("Power Slide")) {
            skate2.frear();
        }
    }
}
