
public class InfoClientePessoaJuridica implements InfoCliente {

    private String cnpj;
    private final String tipoDePessoa = "Juridica";

    public InfoClientePessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;

    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void exibirCliente(Cliente cliente) {
        System.out.println("\n-Cliente-");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereco: " + cliente.getEndereco());
        System.out.println("Tipo de pessoa: " + this.tipoDePessoa);
        System.out.println("CNPJ: " + this.cnpj);
    }
}
