/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto_3;

/**
 *
 * @author cordo
 */
class Bebida {
    private String identificador;
    private double cantidadLitros;
    private double precio;
    private String marca;
    
    public Bebida(String identificador, double cantidadLitros, double precio, String marca) {
        this.identificador = identificador;
        this.cantidadLitros = cantidadLitros;
        this.precio = precio;
        this.marca = marca;
    }
    
    public String getIdentificador() {
        return identificador;
    }
    
    public double getCantidadLitros() {
        return cantidadLitros;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarInformacion() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Cantidad de litros: " + cantidadLitros);
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
    }
}
