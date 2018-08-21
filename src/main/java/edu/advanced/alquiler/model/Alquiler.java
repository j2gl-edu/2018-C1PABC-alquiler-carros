package edu.advanced.alquiler.model;

import java.util.Date;

public class Alquiler {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Date fechaInicial;
    private int dias;

    public Alquiler(Cliente cliente, 
                    Vehiculo vehiculo,
                    Date fechaInicial, 
                    int dias) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicial = fechaInicial;
        this.dias = dias;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * @return the fechaInicial
     */
    public Date getFechaInicial() {
        return fechaInicial;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @param vehiculo the vehiculo to set
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * @param fechaInicial the fechaInicial to set
     */
    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

}