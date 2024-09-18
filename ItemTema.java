package lpa_Encapsulamento;

public class ItemTema {

	private String nome;
	private int id;
	private String descricao;

	public ItemTema() {}
	public ItemTema(String nome,int id , String descricao) {
		this.nome = nome;
		this.id= id;
		this.descricao = descricao ;

	}
	// Getter  para nome
	public String getNome() {
		return nome;
	}

	// Setter para o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	// Getter para id
	public int getId() {
		return id;
	}

	// Setter para o id
	public void setId(int id) {
		this.id = id;
	}
	// Getter para descricao
	public String getDescricao() {
		return descricao;
	}

	// Setter para descricao
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}



