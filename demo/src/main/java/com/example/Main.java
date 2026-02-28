package com.example;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Samuel", "Rengifo", "1457893621", 1998);
        Persona persona2 = new Persona("Jhon", "Montes", "1572364894", 2001);

        System.out.println("Información de la persona 1:");
        persona1.imprimirInformacion();
        System.out.println("Edad: " +persona1.calcularEdad()+ " años");

        System.out.println("\nInformación de la persona 2:");
        persona2.imprimirInformacion();
        System.out.println("Edad: " +persona2.calcularEdad()+ " años");
    }
}