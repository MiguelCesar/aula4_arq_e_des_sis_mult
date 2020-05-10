package aula4_ex7_2;

import java.util.Arrays;

public class MainTemplate
{
	private static final int NUM = 5;

	private static Double[] constroiVetor() 
	{
		Double[] vetor = new Double[NUM];
		for (int i = 0; i < vetor.length; i++)
		{
			vetor[i] = Math.random() * NUM;
		}
		return vetor;
	}

	public static void main(String[] args) throws Exception 
	{
		// Constroi o vetor.
		Double[] vetor = constroiVetor();

		// Ordena o vetor.
		Arrays.sort(vetor, new ComparatorDouble());

		// Imprime o vetor.
		System.out.println(Arrays.toString(vetor));
	}
}