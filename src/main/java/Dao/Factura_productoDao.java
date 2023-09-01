package Dao;

import java.util.List;
import Modelo.Factura_producto;

public interface Factura_productoDao {
	public void crear_tabla();

	public void insertar(Factura_producto factura_producto);

	public List<Factura_producto> listar();
}
