package br.com.roberto.igtidp.structural.composite;

public class Cliente {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Amanda Melo");
        Funcionario atendente = new Atendente("Maria Vitória");
        Funcionario caixa = new Caixa("Camila Arantes");

        gerente.adicionar(atendente);
        gerente.ImprimirNome();
        gerente.adicionar(caixa);
        gerente.ImprimirNome();
        gerente.remover(atendente);
    }
}
