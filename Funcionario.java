public class Funcionario extends ClienteEspecial{
    private String setor;
    private int id;
    private double salario;
   
    public Funcionario(String nome, int idade, String cpf, String endereco, boolean bomCliente,
            Item[] carrinhosDeCompras, int carrinho, int pontos, double saldoDeCompras, String setor, int id,
            double salario) {
        super(nome, idade, cpf, endereco, bomCliente, carrinhosDeCompras, carrinho, pontos, saldoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void renovarEstoque(int inteiro, Item itens) {

    }
    
    public void bloquearItem(Item itens, boolean indisponível) {
        itens.setDisponibilidade(!indisponível);
    }
    
}





   