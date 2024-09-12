
public class Carro extends Veiculo {

    private String placa;
    private String motor;
    private String cor;
    private String transmissao;
    private int nDeMarchas;

    public Carro(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, String placa, String motor, String cor, String transmissao, int nDeMarchas) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.placa = placa;
        this.motor = motor;
        this.cor = cor;
        this.transmissao = transmissao;
        this.nDeMarchas = nDeMarchas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
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

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setNDeMarchas(int nDeMarchas) {
        this.nDeMarchas = nDeMarchas;
    }

    public int getNDeMarchas() {
        return nDeMarchas;
    }

    public void exibirCarro() {
        System.out.println("\n-Carro-");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("Valor: " + getValor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Motor: " + getMotor());
        System.out.println("Cor: " + getCor());
        System.out.println("Transmissao: " + getTransmissao());
        System.out.println("Numero de Marchas: " + getNDeMarchas());
    }

    public void ligarCarro() {
        System.out.println("\nLigando o carro");
    }

    public void acelerar() {
        System.out.println("\nAumentando a velocidade");
    }

    public void frear() {
        System.out.println("\nDiminuindo a velocidade");
    }

    public void chegarNoDestino() {
        System.out.println("\nDesliga o carro e desce em seu destino");
    }

    public static void main(String args[]) {
        Carro carro1 = new Carro("Hyundai", "HB20", 2021, 160, 70000, "SAE1234", "1.0 3V", "Branco", "Manual", 5);
        Carro carro2 = new Carro("Honda", "Civic Sport", 2020, 195, 110000, "SBA13V4", "2.0 i-VTEC Aspirado", "Preto", "Automatica", 7);

        carro1.exibirCarro();
        carro1.ligarCarro();
        carro1.acelerar();
        carro1.frear();
        carro1.chegarNoDestino();

        carro2.exibirCarro();
        carro2.ligarCarro();
        carro2.acelerar();
        carro2.frear();
        carro2.chegarNoDestino();
    }
}
