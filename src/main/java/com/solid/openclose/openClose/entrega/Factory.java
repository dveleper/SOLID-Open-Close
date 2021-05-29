package com.solid.openclose.openClose.entrega;

import com.solid.openclose.openClose.CiudadEnum;
import java.util.HashMap;
import java.util.Map;

public class Factory {

    private Map<CiudadEnum, IEntrega> diccionarioEntrega;
    private static Factory instance;

    private Factory() {
        
        diccionarioEntrega = new HashMap<>();
        diccionarioEntrega.put(CiudadEnum.COLOMBIA, new ColombiaEntrega());
        diccionarioEntrega.put(CiudadEnum.MEXICO, new MexicoEntrega());
        
    }

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public IEntrega getFactory(CiudadEnum ciudad) {
        IEntrega resultado = null;
        if (diccionarioEntrega.containsKey(ciudad)) {
            resultado = diccionarioEntrega.get(ciudad);
        }
        return resultado;
    }
}
