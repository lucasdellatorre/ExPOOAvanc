public class Equipe {
    private Funcionario[] listaFuncionarios;
    private int indice;
    public Equipe(int tamVet)
    {
        listaFuncionarios = new Funcionario[tamVet];
        indice = 0;
    }
    public boolean adicionaFuncionario(Funcionario f)
    {
        if(indice > listaFuncionarios.length) return false;
        listaFuncionarios[indice] = f;
        indice++;
        return true;
    }
    public String geraResumo()
    {
        String msg = "";
        for(int i = 0; i < indice; i++)
        {
            msg = msg + listaFuncionarios[i].toString() + "\n";
        }
        return msg;
    }
}
