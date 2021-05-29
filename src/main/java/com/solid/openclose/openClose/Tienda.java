package com.solid.openclose.openClose;

import com.solid.openclose.openClose.entrega.Factory;
import com.solid.openclose.openClose.entrega.IEntrega;

public class Tienda {
    
    public double calcularPedido(Orden orden){
        if (orden == null) return -1;
        
        IEntrega entrega = Factory.getInstance().getFactory(orden.getCiudad());
        double resultado = entrega.calcularCosto(orden);
        
        return resultado;
    }
}
