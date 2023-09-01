package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Modelo.Factura;
import util.ConnectionFactory;

public class FacturaDAOImplMySQL implements FacturaDao {
	private Connection connection;

	public FacturaDAOImplMySQL(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void crear_tabla() {
		try {
			//this.connection.getInstance().
			Statement stmt = this.connection.createStatement();
			String sql = "CREATE TABLE Factura ( idFactura INT, idCliente INT)";
			stmt.executeUpdate(sql);
			ConnectionFactory.getInstance().disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void insertar(Factura factura) {
		// código para insertar un jugador en la base de datos
	}

	@Override
	public List<Factura> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Factura> listar() {
		// código para listar todos los jugadores de la base de datos
		return null;
	}*/
}
