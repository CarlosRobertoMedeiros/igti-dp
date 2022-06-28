package br.com.roberto.igtidp.structural.composite;

public class Presidente extends Supervisor{

    public Presidente(String nomeSupervisor) {
        super(nomeSupervisor);
        this.nomeFuncionario = nomeSupervisor;
    }

    @Override
    public void ImprimirNome() {
        System.out.println(this.nomeFuncionario);
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.ImprimirNome();
        }
    }

}
