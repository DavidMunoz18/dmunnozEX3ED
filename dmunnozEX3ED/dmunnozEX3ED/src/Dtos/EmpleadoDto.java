package Dtos;

import java.time.LocalDate;
/**
 * Clase que contiene los atributos del empleado, los getter y setter y los constructores
 */
public class EmpleadoDto {

	long idVenta;
	String nombreVenta = "aaaaa";
	LocalDate fechaInstanteVenta = LocalDate.now();
	String importeTotalVentas = "aaaaa";
	String importeVentaSeparado = "aaaaa";
	
	public long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	public String getNombreVenta() {
		return nombreVenta;
	}
	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}
	public LocalDate getFechaInstanteVenta() {
		return fechaInstanteVenta;
	}
	public void setFechaInstanteVenta(LocalDate fechaInstanteVenta) {
		this.fechaInstanteVenta = fechaInstanteVenta;
	}
	public String getImporteTotalVentas() {
		return importeTotalVentas;
	}
	public void setImporteTotalVentas(String importeTotalVentas) {
		this.importeTotalVentas = importeTotalVentas;
	}
	public String getImporteVentaSeparado() {
		return importeVentaSeparado;
	}
	public void setImporteVentaSeparado(String importeVentaSeparado) {
		this.importeVentaSeparado = importeVentaSeparado;
	}
	
	public EmpleadoDto() {
		super();
	}
	public EmpleadoDto(long idVenta, String nombreVenta, LocalDate fechaInstanteVenta, String importeTotalVentas,
			String importeVentaSeparado) {
		super();
		this.idVenta = idVenta;
		this.nombreVenta = nombreVenta;
		this.fechaInstanteVenta = fechaInstanteVenta;
		this.importeTotalVentas = importeTotalVentas;
		this.importeVentaSeparado = importeVentaSeparado;
	}
	
	
	
	
}
