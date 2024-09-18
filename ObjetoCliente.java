package lpa_Encapsulamento;

public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNome("Lusca");
		c1.setTelefone("(00)99101-1010");
		c1.setCpf("123.456.789-01");
		c1.setRg("123.456.789");
		System.out.println("-------------");
		System.out.println(c1.getId());
		System.out.println(c1.getNome());
		System.out.println(c1.getTelefone());
		System.out.println(c1.getCpf());
		System.out.println(c1.getRg());
		Cliente c2 = new Cliente(2,"Lucas","(00)99202-2020","123.456.789-02","987.654.321");
		System.out.println("-------------");
		System.out.println(c2.getId());
		System.out.println(c2.getNome());
		System.out.println(c2.getTelefone());
		System.out.println(c2.getCpf());
		System.out.println(c2.getRg());
	}
}