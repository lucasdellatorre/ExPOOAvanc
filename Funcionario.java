public class Funcionario {
    protected String nome;
    protected double salarioBase;
    protected double descontos;
    public Funcionario(){}
    public Funcionario(String nome, double salarioBase, double descontos)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.descontos = descontos;
    }

    public double calculaSalario()
    {
        return salarioBase - descontos;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                " nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", descontos=" + descontos +
               ", Salario Final: " + calculaSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }
}
