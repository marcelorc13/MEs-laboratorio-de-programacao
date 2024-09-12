
public class Aviao extends Veiculo {

    private int capacidadeMaxima;
    private int tripulacao;
    private String tipoMotor;
    private int numeroMotores;
    private double quantidadeCombustivel;

    public Aviao(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, int capacidadeMaxima, int tripulacao, String tipoMotor, int numeroMotores, double quantidadeCombustivel) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.capacidadeMaxima = capacidadeMaxima;
        this.tripulacao = tripulacao;
        this.tipoMotor = tipoMotor;
        this.numeroMotores = numeroMotores;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public int getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getTripulacao() {
        return this.tripulacao;
    }

    public void setTripulacao(int tripulacao) {
        this.tripulacao = tripulacao;
    }

    public String getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getNumeroMotores() {
        return this.numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public double getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public boolean abrirPortas(int nDePassageiros) {
        if (nDePassageiros < capacidadeMaxima && nDePassageiros >= 0) {
            System.out.println("\nA portas estao abertas para a entrada dos " + nDePassageiros + " passageiros");
            return true;
        } else {
            System.out.println("\nO aviao possui mais passageiro que sua capacidade, ele nao pode decolar com esse numero de passageiros");
            return false;
        }
    }

    public void decolar() {
        System.out.println("\nO " + getMarca() + " " + getModelo() + " esta decolando, mantenham seus cintos de seguranca fechados!");
    }

    public void voar() {
        System.out.println("\nO " + getMarca() + " " + getModelo() + " esta voando");
    }

    public void pousar() {
        System.out.println("\nO " + getMarca() + " " + getModelo() + " esta pousando, obrigado pelo voo!");
    }

    public void exibirAviao() {

        System.out.println("\n-Aviao-");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("Valor: " + getValor());
        System.out.println("Capacidade Maxima: " + getCapacidadeMaxima());
        System.out.println("Pessoas na Tripulacao: " + getTripulacao());
        System.out.println("Tipo do Motor: " + getTipoMotor());
        System.out.println("Numero de Motores: " + getNumeroMotores());
        System.out.println("Quantidade de Combustivel: " + getQuantidadeCombustivel() + "L");
    }

    public static void main(String args[]) {
        Aviao aviao1 = new Aviao("Boeing", "737", 2014, 937, 527000000, 215, 8, "Turbina", 2, 230);
        Aviao aviao2 = new Aviao("Airbus", "A320", 2020, 900, 100000000, 190, 7, "Turbina", 2, 200);
        aviao1.exibirAviao();
        if (aviao1.abrirPortas(200)) {
            aviao1.decolar();
            aviao1.voar();
            aviao1.pousar();
        }

        aviao2.exibirAviao();
        if (aviao2.abrirPortas(200)) {
            aviao2.decolar();
            aviao2.voar();
            aviao2.pousar();
        }
    }
}
