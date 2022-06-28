package br.com.roberto.igtidp.structural.composite;

public class Gerente extends Supervisor{

    public Gerente(String nomeSupervisor) {
        super(nomeSupervisor);
        this.nomeFuncionario = nomeSupervisor;
    }

   @Override
    public void ImprimirNome() {
        for (Funcionario funcionarioTmp : funcionarios) {
            funcionarioTmp.ImprimirNome();
        }
    }

}
