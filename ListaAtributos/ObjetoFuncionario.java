package ListaAtributos;

public class ObjetoFuncionario {

	public static void main(String[] args) {
		
		
		Funcionarios f1 = new Funcionarios();
		Funcionarios f2 = new Funcionarios();
		
		
		f1.setNome("Monica");
		f1.setIdade("25");
		f1.setCargo("Gerente");
		f1.setHorario(" das 08:00 ás 17:00 " );
		f1.setSalario(" R$ 5000.0");
		
		System.out.println(" Funcionaria N1°" );
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Idade: " + f1.getIdade());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Horario de Trabalho: " + f1.getHorario());
		System.out.println("Salario: "+ f1.getSalario());
		
		System.out.println();
		
		f2.setNome("Maria");
		f2.setIdade("29");
		f2.setCargo("RH");
		f2.setHorario(" das 09:00 ás 16:00 " );
		f2.setSalario(" R$ 6000.0");
		
		System.out.println(" Funcionaria N2°" );
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Idade: " + f2.getIdade());
		System.out.println("Cargo: " + f2.getCargo());
		System.out.println("Horario de Trabalho: " + f2.getHorario());
		System.out.println("Salario: "+ f2.getSalario());
		
		
		

	}

}
