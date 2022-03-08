package ListaAtributos;

public class ObjetoAvião {

	public static void main(String[] args) {
		
		
		//Estanciamento de objeto - criar o objeto 
		Avião A1 = new Avião();
		Avião A2 = new Avião();
		
		A1.Tipo = "Avião";
		A1.modelo = "Boeing B767";
		A1.marca = "TAM";
		A1.velocidade = 0;
		
		System.out.println(A1.Tipo);
		System.out.println(A1.modelo);
		System.out.println(A1.marca);
		System.out.println("velocidade : " + A1.velocidade );
		
		A1.decolar(280);
	
		System.out.println("Velocidade acelerando..: " + A1.velocidade);
		System.out.println();
		
		A1.aterrissar(240);
		System.out.println("Velocidade Aterrissando..: " + A1.velocidade);
		System.out.println();
		
		A2.Tipo = "Helicoptero";
		A2.modelo = "H160";
		A2.marca = "Airbus";
		A2.velocidade = 0;
		
		System.out.println(A2.Tipo);
		System.out.println(A2.modelo);
		System.out.println(A2.marca);
		System.out.println("velocidade : " + A2.velocidade );
		
		A2.decolar(130);
	
		System.out.println("Velocidade acelerando..: " + A2.velocidade);
		System.out.println();
		
		A2.aterrissar(100);
		System.out.println("Velocidade Aterrissando..: " + A2.velocidade);
		System.out.println();
		
		

	}

}
