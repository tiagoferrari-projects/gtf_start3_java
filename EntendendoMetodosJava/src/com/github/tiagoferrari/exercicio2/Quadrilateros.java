package com.github.tiagoferrari.exercicio2;

public class Quadrilateros {

    public static void calculaQuadrilatero (double lado) {
        System.out.printf("A área do quadrado é : %.2f%n", lado * lado);
    }

    public static void calculaQuadrilatero (double largura, double altura) {
        System.out.printf("A área do retângulo é : %.2f%n", largura * altura);
    }

    public static void calculaQuadrilatero (double baseMaior, double baseMenor, double altura) {
        System.out.printf("A área do trapézio é : %.2f%n", ((baseMaior + baseMenor) * altura) / 2.0);
    }
}
