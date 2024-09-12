
public class Trem extends Veiculo {

    private String tipoDeTrem;
    private int capacidade;
    private int nDeVagoes;
    private String tipoDeCombustivel;
    private double comprimento;

    public Trem(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, String tipoDeTrem, int capacidade, int nDeVagoes, String tipoDeCombustivel, double comprimento) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.tipoDeTrem = tipoDeTrem;
        this.capacidade = capacidade;
        this.nDeVagoes = nDeVagoes;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.comprimento = comprimento;
    }

    public void setTipoDeTrem(String tipoDeTrem) {
        this.tipoDeTrem = tipoDeTrem;
    }

    public String getTipoDeTrem() {
        return tipoDeTrem;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNDeVagoes(int nDeVagoes) {
        this.nDeVagoes = nDeVagoes;
    }

    public int getNDeVagoes() {
        return nDeVagoes;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getTipoDeCsetTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void iniciarViagem() {
        System.out.println("O trem iniciou sua viagem.");
    }

    public void pararTrem() {
        System.out.println("O trem está parando na estação.");
    }

    public void acoplarVagao() {
        nDeVagoes += 1;
        System.out.println("Um vagão foi acoplado. Número total de vagões: " + nDeVagoes);
    }

    public void desacoplarVagao() {
        if (nDeVagoes > 0) {
            nDeVagoes -= 1;
            System.out.println("Um vagão foi desacoplado. Número total de vagões: " + nDeVagoes);
        } else {
            System.out.println("Não há vagões para desacoplar.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes do trem:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Tipo de Trem: " + getTipoDeTrem());
        System.out.println("Capacidade: " + getCapacidade() + " passageiros");
        System.out.println("Número de Vagões: " + getNDeVagoes());
        System.out.println("Tipo de Combustível: " + getTipoDeCsetTipoDeCombustivel());
        System.out.println("Comprimento: " + getComprimento() + " metros");
    }

    public static void main(String[] args) {
        Trem trem1 = new Trem("Siemens", "Velaro", 2020, 300, 50000000, "Trem-bala", 450, 8, "Elétrico", 200);

        trem1.iniciarViagem();
        trem1.acoplarVagao();
        trem1.desacoplarVagao();
        trem1.pararTrem();
        trem1.mostrarDetalhes();
    }
}
