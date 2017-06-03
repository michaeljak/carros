package br.com.carro.Model;

public class Endereco {

	
	protected int id;
	protected String logradouro;
	protected String numero;
	protected String complemento; 
	protected String cep;
	protected EnumEstado	uf;
	
	public  Endereco(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public EnumEstado getUf() {
		return uf;
	}

	public void setUf(EnumEstado uf) {
		this.uf = uf;
	}
	
	
	
}
