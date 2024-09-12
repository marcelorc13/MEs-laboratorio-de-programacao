
public class Moto extends Veiculo {

    private int cilindradas;
    private String placa;
    private String motor;
    private String transmissao;
    private String suspensao;

    public Moto(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, int cilindradas, String placa, String motor, String transmissao, String suspensao) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.cilindradas = cilindradas;
        this.placa = placa;
        this.motor = motor;
        this.transmissao = transmissao;
        this.suspensao = suspensao;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
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

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    public void frear() {
        System.out.println("A moto está freando.");
    }

    public void realizarManutencao() {
        System.out.println("Manutenção da moto realizada. Motor: " + getMotor() + ", Suspensão: " + getSuspensao());
    }

    public void trocarOleo() {
        System.out.println("O óleo da moto foi trocado.");
    }

    public void mostrarDetalhes() {
        System.out.println("Detalhes da moto:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Velocidade Máxima: " + getVelocidadeMaxima() + " km/h");
        System.out.println("Valor: R$ " + getValor());
        System.out.println("Cilindradas: " + getCilindradas());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Motor: " + getMotor());
        System.out.println("Transmissão: " + getTransmissao());
        System.out.println("Suspensão: " + getSuspensao());
    }

    public static void main(String[] args) {
        Moto moto1 = new Moto("Honda", "CB500F", 2022, 180, 35000, 500, "ABC-1234", "DOHC", "Manual", "Invertida");

        moto1.acelerar();
        moto1.frear();
        moto1.realizarManutencao();
        moto1.trocarOleo();
        moto1.mostrarDetalhes();
    }
}
