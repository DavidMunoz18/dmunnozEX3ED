package Servicios;

/**
 * Clase que contiene los metodos relacionados con el menu
 */
public interface MenuInterfaz {

	/**
	 * Metodo del menu principal
	 * @return
	 */
	public int menuYSeleccionPrincipal();

	/**
	 * Metodo del menu empleado
	 * @return
	 */
	public int menuEmpleado();
	
	/**
	 * Metodo del menu gerencia
	 * @return
	 */
	public int menuGerencia();
}
