package lpa_Encapsulamento;

public class Tema {
	private int id;
	private String nome;
	private double valorAluguel;
	private String corTolha;
	//construtor
	public Tema() {}
	public Tema(int id, String nome, double valorAluguel, String corTolha) {
		this.nome = nome;
		this.corTolha = corTolha;
		this.id = id;;
		this.valorAluguel = valorAluguel;
	}
	//getter e setter para nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	//getter e setter para corTolha
	public String getCorTolha() {
		return corTolha;
	}
	public void setCorTolha(String corTolha) {
		this.corTolha=corTolha;
	}
	//getter e setter para valorAluguel
	public double getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//getter e setter para valorAluguel
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
}
