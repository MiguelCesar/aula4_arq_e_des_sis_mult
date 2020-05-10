package aula4_ex4_2;

public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) { 
		this.somador =somador;
	}

	public void executar() {
		//vetor de inteiros
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int soma =somador.somaVetor(vetor); 
		System.out.println("Resultado: " +soma); 
	}
}
