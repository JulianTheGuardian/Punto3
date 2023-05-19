/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udes.punto_3;

/**
 *
 * @author cordo
 */
public class Punto_3 {

    public static void main(String[] args) {
        Almacen almacen = new Almacen(3, 3);
        
        Bebida aguaMineral = new AguaMineral("001", 1.5, 2.5, "Manantial X", "Origen X");
        Bebida bebidaAzucarada = new BebidaAzucarada("002", 0.5, 1.5, "Coca-Cola", 10.0, true);
        
        almacen.agregarProducto(aguaMineral);
        almacen.agregarProducto(bebidaAzucarada);
        
        almacen.calcularPrecioBebidas();
        almacen.calcularPrecioMarcaBebida("Coca-Cola");
        
        almacen.mostrarInformacionBebidas();
    }
}
