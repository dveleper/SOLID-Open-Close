package com.solid.openclose.openClose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenCloseApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenCloseApplication.class, args);
        
        Tienda tienda = new Tienda();

        Orden ordenUno = new Orden();
        ordenUno.setCiudad(CiudadEnum.MEXICO);
        ordenUno.setTotal(8000);
        ordenUno.setPeso(1);

        Orden ordenDos = new Orden();
        ordenDos.setCiudad(CiudadEnum.COLOMBIA);
        ordenDos.setTotal(100000);
        ordenDos.setPeso(1);

        double costoUno = tienda.calcularPedido(ordenUno);
        System.out.println("Costo Orden Uno: " + costoUno);

        double costoDos = tienda.calcularPedido(ordenDos);
        System.out.println("Costo Orden Dos: " + costoDos);
    }

}
