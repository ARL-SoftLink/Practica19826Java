package com.mycompany.practica19826_java.ejercicio9;
public class Principal {
    public static void main(String[] args) {
        Estudiante[] grupo = new Estudiante[3];
        grupo[0] = new Estudiante("Ana", 8.0);
        grupo[1] = new Estudiante("Luis", 6.0);
        grupo[2] = new Estudiante("Marta", 10.0);

        double suma = 0;
        for (Estudiante e : grupo) {
            suma = suma + e.nota;
        }
        double promedio = suma / grupo.length;

        System.out.println("Promedio: " + promedio);
    }
}