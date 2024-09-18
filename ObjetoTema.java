package lpa_Encapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
		Tema tema1 = new Tema();
		tema1.setId(1);
		tema1.setNome("Tolha");
		tema1.setValorAluguel(1200.00);
		tema1.setCorTolha("Verde");
		System.out.println("----------------");
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorTolha());
		Tema tema2 = new Tema(12,"sla",1200.00,"Azul");
		System.out.println("----------------");
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorTolha());
	}
}
