package ListaAtributos;



public class ObjetoEletronicos {

	public static void main(String[] args) {
		
	
		
		produtoEletronico PDE1 = new produtoEletronico();
		
		PDE1.setModelo("Som");
		PDE1.setCor("Preto");
		PDE1.setPreco(1500.0);
		
		
		System.out.println("Modelo: " + PDE1.getModelo());
		System.out.println("Cor: " + PDE1.getCor());
		System.out.println("Preço: "+ PDE1.getPreco());
		
		
		
		
		
		

	}

}
