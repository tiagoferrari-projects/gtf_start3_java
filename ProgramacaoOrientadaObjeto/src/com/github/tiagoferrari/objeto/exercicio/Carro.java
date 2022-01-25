package com.github.tiagoferrari.objeto.exercicio;

public class Carro {

    String cor;
    String modelo;
    int tanqueCombustivel;

    public Carro(){

    }

    public Carro(String cor, String modelo, int tanqueCombustivel) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTanqueCombustivel(){
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(int tanqueCombustivel){
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public double valorEncherTanque (double valorCombustivel){
        return valorCombustivel * tanqueCombustivel;
    }

    @Override
    public String toString() {
        return  "Cor do carro: " + cor  +
                "\nModelo: " + modelo +
                "\nCapacidade tanque de combustível: " + tanqueCombustivel + "L";
    }
}
