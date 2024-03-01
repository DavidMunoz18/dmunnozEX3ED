package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public int menuYSeleccionPrincipal() {
		int opcion;
		System.out.println("###########################");
		System.out.println("0. Cerrar menu");
		System.out.println("1. Menú empleado");
		System.out.println("2. Menú gerencia");
		System.out.println("###########################");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public int menuEmpleado() {
		int opcion;
		System.out.println("###########################");
		System.out.println("1. Calculo total de ventas diarias");
		System.out.println("2. Añadir venta");
		System.out.println("###########################");
		opcion = sc.nextInt();
		return opcion;
	}

	@Override
	public int menuGerencia() {
		int opcion;
		System.out.println("###########################");
		System.out.println("1. Mostrar todas las ventas del día");
		System.out.println("2. Crear un nuevo pedido para proveedores");
		System.out.println("###########################");
		opcion = sc.nextInt();
		return opcion;
	}

}
