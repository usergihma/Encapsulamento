package lpa_Encapsulamento;

public class Produto {
	//Atributos privados
	private String nome;
	private double preco;

	//Construtor
	public Produto(String nome) {
		this.nome = nome;
		setPreco(preco);
	}
	//Getter para o nome
	public String getNome() {
		return nome;
	}
	//Setter para o nome 
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	} 
	public void getPreco(double preco) {
		this.preco = preco;
	}

	//Setter para o preco com validaçao
	public void setPreco(double preco) {
		if (preco > 0 ) {
			this.preco = preco;
		}else {
			System.out.println("Preço inválido! Não pode ser negativo.");
		}

	}

	public void exibirInformacoes() {
		System.out.println("Produto: " + nome + "Preço:" + preco);


	}

}