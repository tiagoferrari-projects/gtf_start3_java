package com.github.tiagoferrari;

public class Operacoes {
    public double a;
    public double b;

    public static double soma(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }

    public static double multiplicacao(double a, double b){
        return a * b;
    }

    public static double divisao(double a, double b){
        return a / b;
    }

    // bônus: resto
    public static double resto(double a, double b){
        return a % b;
    }

    @Override
    public String toString() {
        return "Operações -> " +
                "Soma: " + soma(a, b) +
                " Subtração: " + subtracao(a, b) +
                String.format(" Multiplicação: %.2f", multiplicacao(a, b)) +
                String.format(" Divisão: %.2f", divisao(a, b)) +
                " Resto: " + resto(a, b);
    }
}
