package com.mycompany.practica19826_java.ejercicio8;
public class Principal {
    public static void depositar(CuentaBancaria c, double monto) {
        c.saldo = c.saldo + monto;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(0);
        depositar(cuenta, 50);
        System.out.println("Saldo: " + cuenta.saldo);
    }
}