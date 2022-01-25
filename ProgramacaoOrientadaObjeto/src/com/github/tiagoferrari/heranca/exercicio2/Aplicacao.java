package com.github.tiagoferrari.heranca.exercicio2;

public class Aplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        Faxineiro faxineiro2 = (Faxineiro) new Funcionario();
        //Gerente gerente2 = new Funcionario();
    }
}
