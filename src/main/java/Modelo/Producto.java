package Modelo;

public class Producto {

	private Producto idProducto;
	private String nombre;
	private double valor;
	
	public Producto(Producto idProducto, String nombre, double valor) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.valor = valor;
	}
	public Producto getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
