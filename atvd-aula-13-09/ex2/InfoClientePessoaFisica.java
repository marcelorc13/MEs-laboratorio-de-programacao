
public class InfoClientePessoaFisica implements InfoCliente {

    private String cpf;
    final String tipoDePessoa = "Fisica";

    public InfoClientePessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void exibirCliente(Cliente cliente) {
        System.out.println("-Cliente-");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Tipo de pessoa: " + this.tipoDePessoa);
        System.out.println("CPF: " + this.cpf);
    }

}
