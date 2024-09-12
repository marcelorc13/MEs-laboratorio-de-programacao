
public class Lancha extends Veiculo {

    private double tamanho;
    private String motor;
    private String cor;
    private int capacidade;
    private double peso;

    public Lancha(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, double tamanho, String motor, String cor, int capacidade, double peso) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.tamanho = tamanho;
        this.motor = motor;
        this.cor = cor;
        this.capacidade = capacidade;
        this.peso = peso;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void ligarMotor() {
        System.out.println("O motor da lancha foi ligado");
    }

    public void navegar(double distancia) {
        System.out.println("A lancha navegou " + distancia + "Km");
    }

    public void ancorar() {
        System.out.println("A lancha esta ancorada.");
    }

    public void manobrar() {
        System.out.println("A lancha esta manobrando para mudar de direção");
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes da lancha:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Tamanho: " + getTamanho() + " metros");
        System.out.println("Motor: " + getMotor());
        System.out.println("Cor: " + getCor());
        System.out.println("Capacidade de pessoas: " + getCapacidade());
        System.out.println("Peso: " + getPeso() + " kg");
    }

    public static void main(String args[]) {
        Lancha lancha1 = new Lancha("Yamaha", "FX Cruiser", 2023, 80, 150000, 6.5, "V8", "Branca", 8, 1200);
        Lancha lancha2 = new Lancha("Bayliner", "Element E18", 2021, 60, 95000, 5.5, "Mercury", "Azul", 6, 1000);

        lancha1.ligarMotor();
        lancha1.navegar(20);
        lancha1.ancorar();
        lancha1.manobrar();
        lancha1.mostrarDetalhes();

        lancha2.ligarMotor();
        lancha2.navegar(15);
        lancha2.ancorar();
        lancha2.manobrar();
        lancha2.mostrarDetalhes();
    }
}
