/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto_3;

/**
 *
 * @author cordo
 */
class AguaMineral extends Bebida {
    private String origen;
    
    public AguaMineral(String identificador, double cantidadLitros, double precio, String marca, String origen) {
        super(identificador, cantidadLitros, precio, marca);
        this.origen = origen;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Origen: " + origen);
    }
}
