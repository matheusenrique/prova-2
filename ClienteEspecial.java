public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;
    
    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente,
            Item[] carrinhosDeCompras, int carrinho, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente, carrinhosDeCompras, carrinho);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }

    public double finalizarCompra(){
        double valorTotal = super.finalizarCompra();
        double desconto = valorTotal * 0.05;
        saldoDeCompras = valorTotal - desconto;

        if (saldoDeCompras > 100) {
            pontos += 5;
            saldoDeCompras -= 100;
        }
        return saldoDeCompras;
    }

    public void finalizarCompra(Item itens, int pontosPorItens) {
        if (pontos >= pontosPorItens) {
            pontos -= pontosPorItens;
        } else {
            double totalCompra = super.finalizarCompra();
            double desconto = totalCompra * 0.05;
            saldoDeCompras += totalCompra - desconto;
        }
    }

    

}
