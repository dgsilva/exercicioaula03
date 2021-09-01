package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import entities.Fornecedor;
import interfaces.IFornecedorRepository;

public class FornecedorRepository implements IFornecedorRepository {

	@Override
	public void insert(Fornecedor fornecedor) throws Exception {
		String url = "jdbc:mysql://localhost:3306/exercicioaula03?useTimezone=true&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "123456789";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
	    String query = "insert into fornecedor(nome,cnpj,telefone) value(?,?,?)";
	    
	    PreparedStatement statement = connection.prepareStatement(query);
	    
	    statement.setString(1, fornecedor.getNome());
	    statement.setString(2, fornecedor.getCnpj());
	    statement.setString(3, fornecedor.getTelefone());
	    statement.execute();
	    statement.close();
	    connection.close();
	}
	
	

}
