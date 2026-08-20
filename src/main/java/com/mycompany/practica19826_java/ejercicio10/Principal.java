package com.mycompany.practica19826_java.ejercicio10;
public class Principal {
    public static void main(String[] args) {
        Producto[] inventario = new Producto[3];
        inventario[0] = new Producto("Lapiz", 0.50, 100);
        inventario[1] = new Producto("Cuaderno", 2.25, 40);
        inventario[2] = new Producto("Mochila", 15.00, 10);

        double total = 0;
        for (Producto p : inventario) {
            System.out.println(p.nombre + ": $" + p.precio + " x " + p.cantidad);
            total += p.precio * p.cantidad;
        }
        System.out.println("Valor total del inventario: $" + total);
    }
}
