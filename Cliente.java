public class Cliente {
   private String nome;
   private int idade;
   private String cpf;
   private String endereco;
   private boolean bomCliente;
   private Item[] carrinhosDeCompras;
   private int carrinho; // usada em conjunto com carrinhoDeCompras para adicionar ao vetor
   private int cod; // acessar o código do produto

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item[] carrinhosDeCompras, int carrinho) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.endereco = endereco;
    this.bomCliente = bomCliente;
    this.carrinhosDeCompras = carrinhosDeCompras;
    this.carrinho = carrinho;
}


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public boolean isBomCliente() {
        return bomCliente;
    }


    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }


    public Item[] getCarrinhosDeCompras() {
        return carrinhosDeCompras;
    }


    public void setCarrinhosDeCompras(Item[] carrinhosDeCompras) {
        this.carrinhosDeCompras = carrinhosDeCompras;
    }

    

    public int getCarrinho() {
        return carrinho;
    }


    public void setCarrinho(int carrinho) {
        this.carrinho = carrinho;
    }


    public int getCod() {
        return cod;
    }


    public void setCod(int cod) {
        this.cod = cod;
    }


    public void adicionar(Item itens) {
        if(carrinho < 100) {
            carrinhosDeCompras[carrinho] = itens;
            carrinho++;
        }
        else
            System.out.println("O carrinho de compras está cheio.");
    }

    public void cancelar(){
        for (int i = 0; i < carrinho; i++) {
            if (carrinhosDeCompras[i] != null) {
                carrinhosDeCompras[i] = null;
                break;
            }
            if (carrinhosDeCompras[i].getCod() == cod) {
                carrinhosDeCompras[i] = null;
                break;
            }
        }
    }

    public double finalizarCompra() {
        double valorTotal = 0;
        for (int i = 0; i < carrinho; i++) {
            if(carrinhosDeCompras[i] == null) {
                valorTotal += carrinhosDeCompras[i].getValor();
            }
        }
        return valorTotal;
    }
    
    
}
    

