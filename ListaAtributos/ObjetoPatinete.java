package ListaAtributos;

public class ObjetoPatinete extends Patinete {

	public static void main(String[] args) {
		
		Patinete pat1 = new Patinete();
		Patinete pat2 = new Patinete();
		
		System.out.println("Patinete N°1");
		pat1.setModelo("Patinete 360");
		pat1.setCor("Cinza");
		pat1.setPreco(250.0);
		
		System.out.println("Modelo: " + pat1.getModelo());
		System.out.println("Cor: " + pat1.getCor());
		System.out.println("Preço: " + pat1.getPreco());
		
		System.out.println();
		
		System.out.println("Patinete N°2");
		pat2.setModelo("Patinete M240");
		pat2.setCor("Preto");
		pat2.setPreco(200.0);
		
		System.out.println("Modelo: " + pat2.getModelo());
		System.out.println("Cor: " + pat2.getCor());
		System.out.println("Preço: " + pat2.getPreco());

	}

}
