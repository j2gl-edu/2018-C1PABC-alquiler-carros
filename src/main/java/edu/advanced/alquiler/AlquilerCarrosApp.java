package edu.advanced.alquiler;

import edu.advanced.alquiler.model.Cliente;
import edu.advanced.alquiler.model.Vehiculo;

public class AlquilerCarrosApp {

    public static void main(String[] args) {
        System.out.println("Aluiler de Carros App");

        Cliente cliente = new Cliente("Albert Einstein", "123456-0");
        Vehiculo vehiculo = new Vehiculo("P-777ABC", 2018, "BMW", 150.00f);
    }

}