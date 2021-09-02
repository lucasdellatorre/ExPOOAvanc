public class Gerente extends Funcionario{
    private String setor;
    private double adicionalSalario;
    public Gerente(String nome, double salarioBase, double descontos, String setor, double adicionalSalario)
    {
        super(nome, salarioBase, descontos);
        this.setor = setor;
        this.adicionalSalario = adicionalSalario;
    }
    @Override
    public double calculaSalario()
    {
        return super.calculaSalario() + adicionalSalario;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Setor: " + getSetor() + ", Adicional salario: " + getAdicionalSalario();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getAdicionalSalario() {
        return adicionalSalario;
    }

    public void setAdicionalSalario(double adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }
}
