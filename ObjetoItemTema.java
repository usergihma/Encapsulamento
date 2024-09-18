package lpa_Encapsulamento;

public class ObjetoItemTema {

	public static void main(String[] args) {
		ItemTema a = new ItemTema ();

		a.setNome("Mayara");
		a.setId(1);
		a.setDescricao("Colorista");
		
		System.out.println(a.getNome());
		System.out.println(a.getId());
		System.out.println(a.getDescricao());
		
		//Tema 2
		
		ItemTema b = new ItemTema ("Gigi", 1, "Estudante");
		
		System.out.println(b.getNome());
		System.out.println(b.getId());
		System.out.println(b.getDescricao());
	}

}
