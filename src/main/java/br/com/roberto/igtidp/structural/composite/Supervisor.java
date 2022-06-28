package br.com.roberto.igtidp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Funcionario{

    protected List<Funcionario> funcionarios = new ArrayList<>();

    public Supervisor(String nomeSupervisor) {
        this.nomeFuncionario = nomeSupervisor;
    }

    @Override
    protected void adicionar(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    @Override
    protected void remover(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    @Override
    public void ImprimirNome() {
        System.out.println(this.nomeFuncionario);
    }
}
