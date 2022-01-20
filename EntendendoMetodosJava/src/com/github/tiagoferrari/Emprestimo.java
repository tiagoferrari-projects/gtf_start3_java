package com.github.tiagoferrari;

public class Emprestimo {

    public static void calcula(int parcelas, double taxa, double valorEmprestimo){
        if (parcelas == 12){
            double valorFinal = valorEmprestimo + (valorEmprestimo * taxa);
            System.out.printf("O valor total do Empréstimo para 12 parcelas é de R$%.2f%n",valorFinal);
        } else if (parcelas == 24){
            double valorFinal = valorEmprestimo + (valorEmprestimo * taxa);
            System.out.printf("O valor total do Empréstimo para 24 parcelas é de R$%.2f%n",valorFinal);
        } else if (parcelas == 36){
            double valorFinal = valorEmprestimo + (valorEmprestimo * taxa);
            System.out.printf("O valor total do Empréstimo para 36 parcelas é de R$%.2f%n",valorFinal);
        } else {
            System.out.println("Algum valor está inválido! Tente novamente ...");
        }
    }
}
