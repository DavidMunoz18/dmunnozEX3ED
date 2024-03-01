package Servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Dtos.EmpleadoDto;
/**
 * Clase que implementa los metodos de la interfaz
 */
public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner(System.in);
	@Override
	public void aniadirVentas(List<EmpleadoDto> listaEmpleados) {

		EmpleadoDto cliente = darAltaVenta(listaEmpleados);

		listaEmpleados.add(cliente);
	}
/**
 * Metodo que da de alta la venta
 * @param listaEmpleados
 * @return
 */
	private EmpleadoDto darAltaVenta(List<EmpleadoDto> listaEmpleados) {

		EmpleadoDto empleado = new EmpleadoDto();
		

		System.out.println("Importe de la venta realizada");
		empleado.setImporteVentaSeparado(sc.next());
		
		System.out.println("Instante de la venta");
		LocalDate fecha = LocalDate.now();
		fecha = empleado.getFechaInstanteVenta();
		
		return empleado;
		
	}
	/**
	 * Metodo que hace que el id se controle solo
	 * @param listaEmpleados
	 * @return
	 */
	private long idIterativoVenta(List<EmpleadoDto> listaEmpleados) {
		
		long id;
		
		int tamanioLista = listaEmpleados.size();
		
		if(tamanioLista == 0) {
			
			id = 1;
		}
		else {
			id = listaEmpleados.get(tamanioLista - 1).getIdVenta() + 1;
		}
		return id;
	}

}
