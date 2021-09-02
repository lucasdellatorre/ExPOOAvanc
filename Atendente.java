public class Atendente extends Funcionario{
    private int qtdAtendimentos;
    private final int adicionalAtendimento;
    public Atendente(String nome, double salarioBase, double descontos, int qtdAtendimentos, final int adicionalAtendimento)
    {
        super(nome, salarioBase, descontos);
        this.qtdAtendimentos = qtdAtendimentos;
        this.adicionalAtendimento = adicionalAtendimento;
    }

    @Override
    public double calculaSalario()
    {
        return super.calculaSalario() + (qtdAtendimentos * adicionalAtendimento);
    }

    public String toString()
    {
        return super.toString() + ", Quantidade de atendimentos: " + getQtdAtendimentos() + ", Adicional de Atendimentos: " + getAdicionalAtendimento();
    }

    public int getQtdAtendimentos() {
        return qtdAtendimentos;
    }

    public void setQtdAtendimentos(int qtdAtendimentos) {
        this.qtdAtendimentos = qtdAtendimentos;
    }

    public int getAdicionalAtendimento() {
        return adicionalAtendimento;
    }
}
