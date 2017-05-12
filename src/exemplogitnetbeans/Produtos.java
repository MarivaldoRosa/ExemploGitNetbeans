package exemplogitnetbeans;

public class Produtos {
     private double codigo;
    private String descricao;
    private double valor;

    public Produtos() {
    }

    public Produtos(double codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produtos{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

}
