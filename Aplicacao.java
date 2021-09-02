import java.util.Scanner;

public class Aplicacao {
    private Scanner in;
    private Equipe e;
    public Aplicacao(int tamVet)
    {
        e = new Equipe(tamVet);
    }

    public void Simulacao()
    {

        Funcionario f1 = new Funcionario("Maria", 1000, 150);
        e.adicionaFuncionario(f1);
        Gerente g1 = new Gerente("Pedro", 5000, 500, "Contabilidade", 1500);
        e.adicionaFuncionario(g1);
        Vendedor v1 = new Vendedor("Joao", 1500, 100, 0.07, 5000 );
        e.adicionaFuncionario(v1);
        Atendente a1 = new Atendente("Carlos", 1000, 50, 100, 5);
        e.adicionaFuncionario(a1);
        System.out.println(e.geraResumo());
    }
}
