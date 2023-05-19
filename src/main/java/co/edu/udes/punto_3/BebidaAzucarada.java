/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto_3;

/**
 *
 * @author cordo
 */
class BebidaAzucarada extends Bebida {
    private double porcentajeAzucar;
    private boolean tienePromocion;
    
    public BebidaAzucarada(String identificador, double cantidadLitros, double precio, String marca,
                           double porcentajeAzucar, boolean tienePromocion) {
        super(identificador, cantidadLitros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.tienePromocion = tienePromocion;
    }
    
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }
    
    public boolean tienePromocion() {
        return tienePromocion;
    }
    
    @Override
    public void setPrecio(double precio) {
        if (tienePromocion) {
            double descuento = precio * 0.1;
            super.setPrecio(precio - descuento);
        } else {
            super.setPrecio(precio);
        }
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Porcentaje de azúcar: " + porcentajeAzucar);
        System.out.println("Tiene promoción: " + tienePromocion);
    }
}