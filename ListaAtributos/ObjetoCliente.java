package ListaAtributos;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		//Estanciamento de objeto - criar o objeto
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Nome : Maria";
		c1.idade = "Idade: 30 anos";
		c1.endereco = "Endereço: Rua margarida 21";
		
		System.out.println(c1.nome);
		System.out.println(c1.idade);
		System.out.println(c1.endereco);
		
		c1.comprar();
		c1.pagar();
		
		System.out.println();
		
		c2.nome = "Nome: Claudia";
		c2.idade = "Idade: 35 anos";
		c2.endereco = "Endereço: Rua eugenia 7";
		
		System.out.println(c2.nome);
		System.out.println(c2.idade);
		System.out.println(c2.endereco);
		
		c2.comprar();
		c2.pagar();
		
		
		

	}

}
