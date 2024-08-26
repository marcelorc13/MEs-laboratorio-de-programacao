
public class Escola {

    public String nome;
    public String diretor;
    public int nDeSalas;
    public String endereco;

    public Escola() {
        nome = "";
        diretor = "";
        nDeSalas = 0;
        endereco = "";
    }

    public Escola(String e_nome, String e_diretor, int e_nDeSalas, String e_endereco) {
        this.nome = e_nome;
        this.diretor = e_diretor;
        this.nDeSalas = e_nDeSalas;
        this.endereco = e_endereco;
    }

    public void exibirEscola() {
        System.out.println("");
        System.out.println("-Escola-");
        System.out.println("Diretor: " + diretor);
        System.out.println("Numero de Salas: " + nDeSalas);
        System.out.println("Endereco: " + endereco);
    }
}
