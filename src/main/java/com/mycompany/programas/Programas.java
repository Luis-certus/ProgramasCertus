package com.mycompany.programas;

import java.util.Scanner;

public class Programas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Registro de datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Ingrese el cargo del empleado: ");
        String cargoEmpleado = scanner.nextLine();
        System.out.print("Ingrese los ingresos del empleado: ");
        double ingresoEmpleado = scanner.nextDouble();
        System.out.print("Ingrese los gastos del empleado: ");
        double gastoEmpleado = scanner.nextDouble();

        // Cálculo de ahorro
        double ahorroMensual = calcularAhorro(ingresoEmpleado, gastoEmpleado);
        double ahorroAnual = ahorroMensual * 12;

        // Mostrar resultados
        System.out.println("\n--- Resumen de Ahorro ---");
        System.out.println("Nombre del empleado: " + nombreEmpleado);
        System.out.println("Cargo del empleado: " + cargoEmpleado);
        System.out.println("Ingreso mensual: " + ingresoEmpleado);
        System.out.println("Gasto mensual: " + gastoEmpleado);
        System.out.printf("Ahorro mensual: %.2f\n", ahorroMensual);
        System.out.printf("Ahorro anual: %.2f\n", ahorroAnual);
    }

    public static double calcularAhorro(double ingreso, double gasto) {
        return ingreso - gasto;
    }
}