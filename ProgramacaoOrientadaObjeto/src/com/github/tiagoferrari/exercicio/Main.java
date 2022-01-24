package com.github.tiagoferrari.exercicio;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Honda New Civic");
        carro1.setTanqueCombustivel(50);
        System.out.println("Cor do carro: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade do tanque de combustível é de " + carro1.getTanqueCombustivel() + "L");


    }
}
