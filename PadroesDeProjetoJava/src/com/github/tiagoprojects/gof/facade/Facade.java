package com.github.tiagoprojects.gof.facade;

import com.github.tiagoprojects.gof.subsistema1.crm.CrmService;
import com.github.tiagoprojects.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
