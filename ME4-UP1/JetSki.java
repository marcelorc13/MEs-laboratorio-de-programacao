
import java.util.Random;

public class JetSki extends Veiculo {

    private double tamanho;
    private double peso;
    private String cor;
    private int cilindradas;
    private int potenciaDoMotor;

    public JetSki(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, double tamanho, double peso, String cor, int cilindradas, int potenciaDoMotor) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.tamanho = tamanho;
        this.peso = peso;
        this.cor = cor;
        this.cilindradas = cilindradas;
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setPotenciaDoMotor(int potenciaDoMotor) {
        this.potenciaDoMotor = potenciaDoMotor;
    }

    public int getPotenciaDoMotor() {
        return potenciaDoMotor;
    }

    public void exibirJet() {
        System.out.println("\n-Jet Ski-");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("Valor: " + getValor());
        System.out.println("Tamanho: " + getTamanho() + " cm");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Cor: " + getCor());
        System.out.println("Cilindradas: " + getCilindradas() + " cc");
        System.out.println("Potencia: " + getPotenciaDoMotor() + " hp");
    }

    public void ligarJet() {
        System.out.println("\nLigando o Jet Ski");
    }

    public void acelerar() {
        System.out.println("\nO Jet Ski ganha velocidade");
    }

    public boolean fazerManobra() {
        System.out.println("\nVoce tenta fazer uma manobra e...");
        Random random = new Random();
        boolean randomBool = random.nextBoolean();
        if (randomBool) {
            System.out.println("E voce conseguiu, que radical!");
        } else {
            System.out.println("Porem voce caiu na agua :(");
        }
        return randomBool;
    }

    public void parar() {
        System.out.println("\nPara o Jet Ski com seguranca");
    }

    public static void main(String args[]) {
        JetSki jet1 = new JetSki("Sea Doo", "RXP-X 300", 2023, 107, 168000, 331, 354, "Roxo", 1630, 300);
        JetSki jet2 = new JetSki("Sea Doo", "Spark", 2022, 64, 71000, 279, 192, "Laranja", 899, 90);
        jet1.exibirJet();
        jet1.ligarJet();
        jet1.acelerar();
        if (jet1.fazerManobra()) {
            jet1.parar();
        }

        jet2.exibirJet();
        jet2.ligarJet();
        jet2.acelerar();
        if (jet2.fazerManobra()) {
            jet2.parar();
        }
    }
}
