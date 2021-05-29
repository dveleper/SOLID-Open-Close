package com.solid.openclose.openClose.entrega;

import com.solid.openclose.openClose.Orden;

public class MexicoEntrega implements IEntrega {

    @Override
    public double calcularCosto(Orden orden) {
        double resultado = 98;
        return resultado;
    }

}
