
import java.util.Random;

public class Bicicleta extends Veiculo {

    private double tamanhoRoda;
    private int nDeMarchas;
    private String cor;
    private String suspensao;
    private String tipoDeFreio;

    public Bicicleta(String marca, String modelo, int anoFabricacao, double velocidadeMaxima, double valor, double tamanhoRoda, int nDeMarchas, String cor, String suspensao, String tipoDeFreio) {
        super(marca, modelo, anoFabricacao, velocidadeMaxima, valor);
        this.tamanhoRoda = tamanhoRoda;
        this.nDeMarchas = nDeMarchas;
        this.cor = cor;
        this.suspensao = suspensao;
        this.tipoDeFreio = tipoDeFreio;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setNDeMarchas(int nDeMarchas) {
        this.nDeMarchas = nDeMarchas;
    }

    public int getNDeMarchas() {
        return nDeMarchas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setSuspensao(String suspensao) {
        this.suspensao = suspensao;
    }

    public String getSuspensao() {
        return suspensao;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void pedalar() {
        System.out.println("\nPedalando a bicicleta");
    }

    public void frear() {
        System.out.println("\nDiminuindo a velocidade da bicicleta");
    }

    public void trocarMarcha(int marcha) {
        if (marcha > nDeMarchas) {
            System.out.println("\nSua bicicleta nao possui essa marcha");
        } else {
            System.out.println("\nA marcha foi trocada para a " + nDeMarchas + " marcha");
        }
    }

    public boolean darGrau() {
        System.out.println("\nDando grau ...");
        Random random = new Random();
        boolean randomBool = random.nextBoolean();
        if (randomBool) {
            System.out.println("Voce consegue e impressiona todo mundo!");
        } else {
            System.out.println("Voce cai e vai parar no hospital");
        }
        return randomBool;
    }

    public void parar() {
        System.out.println("\nParando e estacionando a bicicleta");
    }

    public void exibirBicicleta() {
        System.out.println("\n-Bicicleta-");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("Valor: " + getValor());
        System.out.println("Tamanho da roda: " + getTamanhoRoda());
        System.out.println("Numero de marchas: " + getNDeMarchas());
        System.out.println("Cor: " + getCor());
        System.out.println("Suspensao: " + getSuspensao());
        System.out.println("Tipo de freio: " + getTipoDeFreio());
    }

    public static void main(String args[]) {
        Bicicleta bicicleta1 = new Bicicleta("Caloi", "Street", 2020, 40, 3000, 26, 7, "Hidraulica", "Azul", "Disco");
        Bicicleta bicicleta2 = new Bicicleta("Scott", "BMX", 2023, 20, 1000, 20, 1, "Hidraulica", "Prata", "Nao possui");

        bicicleta1.exibirBicicleta();
        bicicleta1.pedalar();
        bicicleta1.frear();
        bicicleta1.pedalar();
        bicicleta1.trocarMarcha(4);
        if (bicicleta1.darGrau()) {
            bicicleta1.parar();
        }

        bicicleta2.exibirBicicleta();
        bicicleta2.pedalar();
        bicicleta2.frear();
        bicicleta2.pedalar();
        bicicleta2.trocarMarcha(4);
        if (bicicleta2.darGrau()) {
            bicicleta2.parar();
        }
    }
}
