package br.com.carro.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.carro.Model.Cliente;
import br.com.carro.Model.Pessoa;
import br.com.carro.util.Conexao;

public class UsuarioDao {

	public void salvar(Pessoa cliente, Integer codEndereco, Integer codTelefone) {
			Connection conexaoBD = Conexao.getConnection();
			try {
				PreparedStatement pstmt = conexaoBD.prepareStatement("insert into pessoa(nome,datanascimento,email,senha,cpf,rg,endereco_id,telefone_id) values(?,?,?,?,?,?,?,?) ");
				pstmt.setString(1, cliente.getNome());
				pstmt.setDate(2, new java.sql.Date(cliente.getDataNascimento().getTime()));
				pstmt.setString(3, cliente.getEmail());
				pstmt.setString(4, cliente.getSenha());
				pstmt.setString(4, cliente.getCpf());
				pstmt.setString(5, cliente.getRg());
				pstmt.setInt(6, codEndereco);
				pstmt.setInt(7, codTelefone);
				
				pstmt.execute();
				pstmt.close();
				conexaoBD.close();
				
			} catch (SQLException e) {
				System.out.println("não foi possivel inserir pessoa no Banco ");
				e.printStackTrace();
			}
		
	}

	public void update(Cliente cliente) {

		
	}

}
