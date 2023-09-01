package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Modelo.Factura_producto;
import util.ConnectionFactory;

public class Factura_productoDAOImplMySQL implements Factura_productoDao {
	private Connection connection;

	public Factura_productoDAOImplMySQL(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void crear_tabla() {
		try {
			//this.connection.getInstance().
			Statement stmt = this.connection.createStatement();
			String sql = "CREATE TABLE Factura_producto ( idFactura INT, idProducto INT,  cantidad INT)";
			stmt.executeUpdate(sql);
			ConnectionFactory.getInstance().disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void insertar(Factura_producto factura_producto) {
		// código para insertar un jugador en la base de datos
	}

	@Override
	public List<Factura_producto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Factura_producto> listar() {
		// código para listar todos los jugadores de la base de datos
		return null;
	}*/
}
