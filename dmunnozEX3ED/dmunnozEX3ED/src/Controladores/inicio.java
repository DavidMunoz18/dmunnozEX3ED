package Controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.EmpleadoDto;
import Dtos.GerenteDto;
import Servicios.EmpleadoImplementacion;
import Servicios.EmpleadoInterfaz;
import Servicios.GerenciaImplementacion;
import Servicios.GerenciaInterfaz;
import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

/**
 * Clase principal de la aplicación
 */
public class inicio {
	/**
	 * Metodo de entrada de la aplicación
	 * @param args
	 */
	public static void main(String[] args) {

		List<EmpleadoDto> listaEmpleados = new ArrayList<EmpleadoDto>();
		List<GerenteDto> listaGerentes = new ArrayList<GerenteDto>();
		
		MenuInterfaz mi = new MenuImplementacion();
		EmpleadoInterfaz ei = new EmpleadoImplementacion();
		GerenciaInterfaz gi = new GerenciaImplementacion();
		
		boolean cerrarMenu = false;
		
		int opcion;
		
		while(!cerrarMenu) {
			
			opcion = mi.menuYSeleccionPrincipal();
			switch (opcion) {
			
				case 0:
					cerrarMenu = true;
					break;
				case 1:
					int opcionEmpleado = mi.menuEmpleado();
					switch (opcionEmpleado) {
						case 1:
							break;
						case 2:
							ei.aniadirVentas(listaEmpleados);
							break;
					}
					break;
				case 2:
					int opcionGerencia = mi.menuGerencia();
					switch (opcionGerencia) {
						
						case 1:
							gi.mostrarTotalVentas(listaGerentes, listaEmpleados);
							break;
						case 2:
							gi.crearPedidoProveedores(listaGerentes);
							break;
					}
					break;
			}
		}
	}

}
