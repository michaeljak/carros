package br.com.carro.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.carro.Model.Telefone;
import br.com.carro.util.Conexao;

public class TelefoneDao {

	public Integer salvar(Telefone telefone) {
		Integer codigo =0;
			Connection conexaoBD = Conexao.getConnection();
			try {
				PreparedStatement pstmt = conexaoBD.prepareStatement("insert into telefone(telefone) value(?) RETURNING id");
				pstmt.setString(1, telefone.getTelefone());
				ResultSet rs = pstmt.executeQuery();
				if (rs.next()) {
					return codigo = rs.getInt("id");
					
				}
				pstmt.close();
				conexaoBD.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return codigo;
	}

}
