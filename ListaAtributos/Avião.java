package ListaAtributos;

public class Avi�o {

	//Atributos ---> variav�is
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
