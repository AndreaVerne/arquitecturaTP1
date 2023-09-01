package Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Modelo.Cliente;
import util.ConnectionFactory;

public class ClienteDAOImplMySQL implements ClienteDao {
	private Connection connection;

	public ClienteDAOImplMySQL(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public void crear_tabla() {
		try {
			//this.connection.getInstance().
			Statement stmt = this.connection.createStatement();
			String sql = "CREATE TABLE Cliente ( idCliente INT,nombre VARCHAR(255), email VARCHAR(255))";
			stmt.executeUpdate(sql);
			ConnectionFactory.getInstance().disconnect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void insertar(Cliente cliente) {
		// código para insertar un jugador en la base de datos
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Cliente> listar() {
		// código para listar todos los jugadores de la base de datos
		return null;
	}*/
}

