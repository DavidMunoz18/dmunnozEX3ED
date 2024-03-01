package Servicios;

import java.util.List;

import Dtos.EmpleadoDto;
/**
 * Clase que contiene los metodo del empleado
 */
public interface EmpleadoInterfaz {

	/**
	 * Metodo que añade las nuevas ventas.
	 * @param listaEmpleados
	 */
	public void aniadirVentas(List<EmpleadoDto> listaEmpleados);
}
