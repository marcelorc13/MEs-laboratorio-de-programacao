
public class Main {

    public static void main(String args[]) {
        Cliente pessoa1 = new Cliente("Marcelo", "Rua Luiz Campos teixeira");
        Cliente pessoa2 = new Cliente("Filipe", "Rua D");
        Cliente pessoa3 = new Cliente("Lojinha", "Rua Durval de Goes Monteiro");
        Cliente pessoa4 = new Cliente("Arquitetes", "Rua das Arvores");

        InfoClientePessoaFisica infoPessoa1 = new InfoClientePessoaFisica("12357854");
        InfoClientePessoaFisica infoPessoa2 = new InfoClientePessoaFisica("53094690");
        InfoClientePessoaJuridica infoPessoa3 = new InfoClientePessoaJuridica("4109901");
        InfoClientePessoaJuridica infoPessoa4 = new InfoClientePessoaJuridica("4019241902");

        infoPessoa1.exibirCliente(pessoa1);
        infoPessoa2.exibirCliente(pessoa2);
        infoPessoa3.exibirCliente(pessoa3);
        infoPessoa4.exibirCliente(pessoa4);
    }
}
