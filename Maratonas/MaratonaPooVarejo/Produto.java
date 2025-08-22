package br.com.devsdoagi.Maratonas.MaratonaPooVarejo;

abstract class Produto implements OperacoesProduto{
    private double preco;
    private String codigo;
    private String nome;
    private Cliente comprador;

    public Produto(){
        this.preco = 0.0;
        this.codigo = null;
        this.nome = null;
        this.comprador = null;

    }
    public Produto(double preco, String codigo,
                   String nome, Cliente comprador){
        this.preco = preco;
        this.codigo = codigo;
        this.nome = nome;
        this.comprador = comprador;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    @Override
    public void aplicarDesconto(double percentual){
        setPreco(this.preco * (1 - percentual / 100));
    }

    @Override
    public void aumentarPreco(double percentual){
        setPreco(this.preco * (1 + percentual / 100));
    }

    public abstract void calcularFrete();
}
