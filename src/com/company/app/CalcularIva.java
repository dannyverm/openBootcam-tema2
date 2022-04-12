package com.company.app;

public class CalcularIva {

    public static void main(String[] args) {
	// write your code here
        double precio=1500;
        System.out.println("Total a Pagar: "+calcularIva(precio));
    }

    private static double calcularIva(double precio) {
        return (precio * 0.1)+precio;
    }
}
