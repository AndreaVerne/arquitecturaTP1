package Dao;

import java.util.List;
import Modelo.Factura;

public interface FacturaDao {
	public void crear_tabla();

	public void insertar(Factura factura);

	public List<Factura> listar();
}
