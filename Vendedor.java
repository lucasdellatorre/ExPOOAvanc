public class Vendedor extends Funcionario{
    private double comissao;
    private int vendasNoMes;
    public Vendedor(String nome, double salarioBase, double descontos, double comissao, int vendasNoMes)
    {
        super(nome, salarioBase, descontos);
        this.comissao = comissao;
        this.vendasNoMes = vendasNoMes;
    }

    @Override
    public double calculaSalario()
    {
        return super.calculaSalario() + (comissao * vendasNoMes);
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Comissao: " + getComissao() + ", Vendas no mes: " + getVendasNoMes();// um pouco confuso isso
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendasNoMes() {
        return vendasNoMes;
    }

    public void setVendasNoMes(int vendasNoMes) {
        this.vendasNoMes = vendasNoMes;
    }
}
