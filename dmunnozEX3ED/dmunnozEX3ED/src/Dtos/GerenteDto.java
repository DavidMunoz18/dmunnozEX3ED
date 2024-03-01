package Dtos;

import java.time.LocalDate;
/**
 * Clase que contiene los atributos del gerente, los getter y setter y los constructores
 */
public class GerenteDto {

	Long idProducto;
	String nombreProducto = "aaaaa";
	String cantidadProducto = "aaaaa";
	LocalDate fechaDeseada;
	LocalDate instanteCompra = LocalDate.now();
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public LocalDate getFechaDeseada() {
		return fechaDeseada;
	}
	public void setFechaDeseada(LocalDate fechaDeseada) {
		this.fechaDeseada = fechaDeseada;
	}
	public LocalDate getInstanteCompra() {
		return instanteCompra;
	}
	public void setInstanteCompra(LocalDate instanteCompra) {
		this.instanteCompra = instanteCompra;
	}
	
	public GerenteDto() {
		super();
	}
	public GerenteDto(String nombreProducto, String cantidadProducto, LocalDate fechaDeseada) {
		super();
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.fechaDeseada = fechaDeseada;
	}
	
	
	

	
}
