package Servicios;

import java.util.List;

import Dtos.EmpleadoDto;
import Dtos.GerenteDto;
/**
 * Clase que contiene los metodos de la gerencia
 */
public interface GerenciaInterfaz {
	
	/**
	 * Metodo que controla el total de ventas
	 * @param listaGerentes
	 * @param listaEmpleados
	 */

	public void mostrarTotalVentas(List<GerenteDto> listaGerentes, List<EmpleadoDto> listaEmpleados);
	
	/**
	 * Metodo que crea un pedido a los prooveedores
	 * @param listaGerentes
	 */
	public void crearPedidoProveedores(List<GerenteDto> listaGerentes);
}
