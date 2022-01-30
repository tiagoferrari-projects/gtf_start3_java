package com.github.tiagoprojects.gof.singleton;

/**
 * Singleton"preguiçoso".
 *
 * @author tiagoferrari-projects
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
