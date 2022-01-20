package com.github.tiagoferrari;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Exercício 01: Calculadora
        Operacoes calc = new Operacoes();
        System.out.print("Digite o primeiro valor: ");
        calc.a = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        calc.b = sc.nextDouble();
        System.out.println(calc.toString());

        // Exercício 02: Mensagem
        Mensagem.mensagemSaudacao(0);
        Mensagem.mensagemSaudacao(12);
        Mensagem.mensagemSaudacao(18);

        // Exercício 03: Empréstimo
        Emprestimo.calcula(12,0.25,2500.00);
        Emprestimo.calcula(24,0.30,2500.00);
        Emprestimo.calcula(36,0.45,2500.00);
        Emprestimo.calcula(48,0.45,2500.00);

        sc.close();
    }
}
