
public class Onibus extends Veiculo {

    private String placa;
    private int capacidade;
    private int nDeAssentos;
    private String tipoDeCombustivel;
    private Boolean contemWiFi;

    public Onibus(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, String placa, int capacidade, int nDeAssentos, String tipoDeCombustivel, Boolean contemWiFi) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.placa = placa;
        this.capacidade = capacidade;
        this.nDeAssentos = nDeAssentos;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.contemWiFi = contemWiFi;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setnDeAssentos(int nDeAssentos) {
        this.nDeAssentos = nDeAssentos;
    }

    public int getnDeAssentos() {
        return nDeAssentos;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setContemWiFi(Boolean contemWiFi) {
        this.contemWiFi = contemWiFi;
    }

    public Boolean getContemWiFi() {
        return contemWiFi;
    }

    public void iniciarViagem() {
        System.out.println("O ônibus com placa " + placa + " iniciou a viagem.");
    }

    public void pararEmParada() {
        System.out.println("O ônibus está parando em uma parada.");
    }

    public void embarcarPassageiros(int numero) {
        if (numero <= capacidade) {
            capacidade -= numero;
            System.out.println(numero + " passageiros embarcaram no ônibus. Vagas restantes: " + capacidade);
        } else {
            System.out.println("Não há vagas suficientes para embarcar todos os passageiros.");
        }
    }

    public void desembarcarPassageiros(int numero) {
        capacidade += numero;
        System.out.println(numero + " passageiros desembarcaram do ônibus. Vagas disponíveis: " + capacidade);
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes do ônibus:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Capacidade: " + getCapacidade() + " passageiros");
        System.out.println("Número de Assentos: " + getnDeAssentos());
        System.out.println("Tipo de Combustível: " + getTipoDeCombustivel());
        System.out.println("Contém WiFi: " + (getContemWiFi() ? "Sim" : "Não"));
    }

    public static void main(String[] args) {
        Onibus onibus1 = new Onibus("Mercedes-Benz", "OF 1721", 2018, 110, 300000, "XYZ-1234", 50, 42, "Diesel", true);

        onibus1.iniciarViagem();
        onibus1.embarcarPassageiros(10);
        onibus1.pararEmParada();
        onibus1.desembarcarPassageiros(5);
        onibus1.mostrarDetalhes();
    }
}
