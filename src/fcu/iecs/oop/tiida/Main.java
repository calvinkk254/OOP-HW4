package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		NissanTiida next = new NissanTiida();
		Scanner Scanner = new Scanner(System.in);
		int g = 0 ,k = 1;
		g = Scanner.nextInt();
		for(k=1;k<=g;k++)
		{
		next.print(k);
		System.out.println();
	    Scanner.close();
		}
	}
}
