/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto_3;

/**
 *
 * @author cordo
 */
class Almacen {
    private Bebida[][] estanterias;
    
    public Almacen(int filas, int columnas) {
        estanterias = new Bebida[filas][columnas];
    }
    
    public void calcularPrecioBebidas() {
        double precioTotal = 0.0;
        
        for (Bebida[] estanteria : estanterias) {
            for (Bebida bebida : estanteria) {
                if (bebida != null) {
                    precioTotal += bebida.getPrecio();
                }
            }
        }
        
        System.out.println("El precio total de las bebidas en el almacén es: " + precioTotal);
    }
    
    public void calcularPrecioMarcaBebida(String marca) {
        double precioTotal = 0.0;
        
        for (Bebida[] estanteria : estanterias) {
            for (Bebida bebida : estanteria) {
                if (bebida != null && bebida.getMarca().equalsIgnoreCase(marca)) {
                    precioTotal += bebida.getPrecio();
                }
            }
        }
        
        System.out.println("El precio total de las bebidas de la marca " + marca + " es: " + precioTotal);
    }
    
    public void agregarProducto(Bebida bebida) {
        for (int i = 0; i < estanterias.length; i++) {
            for (int j = 0; j < estanterias[i].length; j++) {
                if (estanterias[i][j] == null) {
                    estanterias[i][j] = bebida;
                    return;
                }
            }
        }
        
        System.out.println("No se pudo agregar la bebida, el almacén está lleno.");
    }
    
    public void eliminarProducto(String identificador) {
        for (int i = 0; i < estanterias.length; i++) {
            for (int j = 0; j < estanterias[i].length; j++) {
                Bebida bebida = estanterias[i][j];
                if (bebida != null && bebida.getIdentificador().equals(identificador)) {
                    estanterias[i][j] = null;
                    System.out.println("Se eliminó el producto con identificador: " + identificador);
                    return;
                }
            }
        }
        
        System.out.println("No se encontró un producto con el identificador: " + identificador);
    }
    
    public void mostrarInformacionBebidas() {
        for (int i = 0; i < estanterias.length; i++) {
            for (int j = 0; j < estanterias[i].length; j++) {
                Bebida bebida = estanterias[i][j];
                if (bebida != null) {
                    System.out.println("Estantería [" + i + "][" + j + "]");
                    bebida.mostrarInformacion();
                    System.out.println();
                }
            }
        }
    }
}