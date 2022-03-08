package ListaAtributos;

public class Avião {

	//Atributos ---> variavéis
	String modelo;
	String Tipo;
	String marca;
	double velocidade;
	
	//Metodos ---> verbos
	void decolar (double aceleracao) {
		velocidade = aceleracao;
		
	}
	void aterrissar(double reduzir) {
		velocidade =reduzir;
	}
}
