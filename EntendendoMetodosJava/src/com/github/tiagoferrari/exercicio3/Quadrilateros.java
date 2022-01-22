package com.github.tiagoferrari.exercicio3;

public class Quadrilateros {

    public static double calculaQuadrilatero (double lado) {
        return lado * lado;
    }

    public static double calculaQuadrilatero (double largura, double altura) {
        return largura * altura;
    }

    public static double calculaQuadrilatero (double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

}
