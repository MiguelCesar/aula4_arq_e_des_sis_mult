package aula4_ex7_2;

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> 
{
	public int compare(Double double1, Double double2) 
	{
		Double double1toCompare = double1 - Math.floor(double1);
		Double double2toCompare = double2 - Math.floor(double2);
		return double1toCompare.compareTo(double2toCompare);
	}
}