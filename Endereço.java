package lpa_Encapsulamento;

public class Endereço {
	private int id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;

	public Endereço() {}
	public Endereço(int id,String logradouro, int numero, String complemento,String bairro,String cidade,String cep , String uf) {
		this.id = id;
		this.logradouro= logradouro;
		this.numero= numero ;
		this.complemento= complemento ;
		this.bairro= bairro ;
		this.cidade= cidade ;
		this.cep= cep ;
		this.uf = uf;
	}
	// Getter  para id
	public int getId() {
		return id;
	}

	// Setter para id
	public void setId(int id) {
		this.id = id;
	}
	// Getter para logradouro
	public String getLogradouro() {
		return logradouro;
	}

	// Setter para o logradouro
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	// Getter para numero
	public int getNumero(){
		return numero;
	}

	// Setter para numero
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Getter para complemento
	public String getComplemento() {
		return complemento;
	}

	// Setter para o complemento
	public void setComplemento(String complemento) {
		this.complemento = complemento;

	}
	// Getter para bairro
	public String getBairro() {
		return bairro;
	}

	// Setter para o bairro
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	// Getter para cidade
	public String getCidade() {
		return cidade;
	}

	// Setter para o cidade
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	// Getter para cep
	public String getCep() {
		return cep;
	}

	// Setter para o cep
	public void setCep(String cep) {
		this.cep = cep;
	}
	// Getter para uf
	public String getUf() {
		return uf;
	}

	// Setter para o uf
	public void setUf(String uf) {
		this.uf = uf;
	}
}

