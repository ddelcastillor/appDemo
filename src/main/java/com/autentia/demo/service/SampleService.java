package com.autentia.demo.service;

import org.springframework.stereotype.Service;

import com.aeat.valida.Validador;

@Service
public class SampleService {
	
    public String validate(String nif) {
    	String result="El NIF "+ nif + " es ";
        Validador validador = new Validador();
        int e = validador.checkNif(nif);
        
        if (e > 0)
        	result+="CORRECTO";
        else
        	result+="INCORRECTO";
        return result;
    }

}
