
import java.text.DecimalFormat;


public class Veiculo {

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double velocidadeMaxima;
    private double valor;

    public Veiculo(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.valor = valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return this.anoFabricacao;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getValor() {
        DecimalFormat df = new DecimalFormat("R$#,###.00");

        return df.format(this.valor);
    }
}
