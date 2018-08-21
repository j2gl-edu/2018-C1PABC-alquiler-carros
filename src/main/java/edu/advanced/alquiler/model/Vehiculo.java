package edu.advanced.alquiler.model;

public class Vehiculo {

    public static String ALQUILADO = "alquilado";
    public static String NO_ALQUILADO = "libre";

    private String placa;
    private int modelo;
    private String marca;
    private float precio;
    private String estado;

    public Vehiculo(String placa, 
                    int modelo, 
                    String marca, 
                    float precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
        this.estado = NO_ALQUILADO;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}