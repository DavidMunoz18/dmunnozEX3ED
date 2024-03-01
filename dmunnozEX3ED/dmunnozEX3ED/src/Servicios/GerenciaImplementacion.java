package Servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import Dtos.EmpleadoDto;
import Dtos.GerenteDto;
/**
 * Clase que implementa los metodos de la interfaz
 */
public class GerenciaImplementacion implements GerenciaInterfaz {

	@Override
	public void mostrarTotalVentas(List<GerenteDto> listaGerentes, List<EmpleadoDto> listaEmpleados) {

		DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		for (EmpleadoDto empleado : listaEmpleados) {

			System.out.println("//////////////////////////////////////////////////////////////");
			System.out.println("Venta numero: " + idIterativoVenta(listaGerentes));
			System.out.println("Euros: " + empleado.getImporteVentaSeparado());
			System.out.println("Instante de compra: " + empleado.getFechaInstanteVenta());
			System.out.println("Introduce la fecha deseada de entrega");
			LocalDate fecha = LocalDate.parse(sc.next(), Formatter);
			System.out.println("//////////////////////////////////////////////////////////////");
		}

	}

	/**
	 * Metodo que hace que el id se controle solo
	 * @param listaEmpleados
	 * @return
	 */
	private long idIterativoVenta(List<GerenteDto> listaGerentes) {

		long id;

		int tamanioLista = listaGerentes.size();

		if (tamanioLista == 0) {

			id = 1;
		} else {
			id = listaGerentes.get(tamanioLista - 1).getIdProducto() + 1;
		}
		return id;
	}

	@Override
	public void crearPedidoProveedores(List<GerenteDto> listaGerentes) {

		DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Desea añadir un producto? (s/n)");
		String s = "s";
		
		boolean cerrar = false;
		
		
		if (sc.next().equals(s)) {
			
			
			System.out.println("Introduce el nombre del producto");
			String nombreProducto = sc.next();

			System.out.println("Introduce la cantidad del producto");
			String cantidad = sc.next();

			System.out.println("Introduce la fecha deseada de entrega");
			LocalDate fecha = LocalDate.parse(sc.next(), Formatter);
			

			GerenteDto gerente = new GerenteDto(nombreProducto, cantidad, fecha);

			listaGerentes.add(gerente);
			
			for (GerenteDto gerente2 : listaGerentes) {

				System.out.println("Producto: " + gerente2.getNombreProducto());
				System.out.println("Cantidad: " + gerente2.getCantidadProducto());
				System.out.println("Fecha deseada entrega: " + gerente2.getFechaDeseada());
		} 
		}
	}

}
