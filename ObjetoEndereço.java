package lpa_Encapsulamento;

public class ObjetoEndereço {

	public static void main(String[] args) {
		Endereço a = new Endereço ();

		a.setId(1);
		a.setLogradouro("a");
		a.setNumero(1);
		a.setComplemento("Corinthians");
		a.setBairro("Jardim Snt. Ines");
		a.setCidade("Itapetininga");
		a.setCep("111");
		a.setUf("aa");

		System.out.println(a.getId());
		System.out.println(a.getLogradouro());
		System.out.println(a.getNumero());
		System.out.println(a.getComplemento());
		System.out.println(a.getBairro());
		System.out.println(a.getCidade());
		System.out.println(a.getCep());
		System.out.println(a.getUf());

		//Tema 2

		Endereço b = new Endereço (2,"b", 2, "Cor", "Vila piedade", "Itape", "222", "bb");

		System.out.println(b.getId());
		System.out.println(b.getLogradouro());
		System.out.println(b.getNumero());
		System.out.println(b.getComplemento());
		System.out.println(b.getBairro());
		System.out.println(b.getCidade());
		System.out.println(b.getCep());
		System.out.println(b.getUf());
	}

}





