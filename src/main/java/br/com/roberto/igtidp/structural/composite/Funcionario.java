package br.com.roberto.igtidp.structural.composite;

public abstract class Funcionario {
    String nomeFuncionario;

    public void ImprimirNome() {
        System.out.println(this.nomeFuncionario);
    }

    protected abstract void adicionar(Funcionario funcionario);
    protected abstract void remover(Funcionario funcionario);
}
