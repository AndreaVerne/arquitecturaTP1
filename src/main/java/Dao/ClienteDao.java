package Dao;

import java.util.List;
import Modelo.Cliente;

public interface ClienteDao {
	public void crear_tabla();

	public void insertar(Cliente cliente);

	public List<Cliente > listar();
}
