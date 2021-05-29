package com.solid.openclose.openClose.entrega;

import com.solid.openclose.openClose.Orden;

public class ColombiaEntrega implements IEntrega {

    @Override
    public double calcularCosto(Orden orden) {
        double resultado = orden.getTotal() * 0.01;
        if (resultado <= 2) {
            resultado += 9900;
        } else {
            resultado += orden.getPeso() * 5000;
        }
        return resultado;
    }

}
