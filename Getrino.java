package FisrtCode;

import java.util.Scanner;

public class Getrino {
      
	public int GetInt(){
		int j = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("\n Degeta um numero interino ae ");
		
		j = in.nextInt();
		
		
		return j;
	}
	public String GetString(){
		String opa;
		Scanner in = new Scanner(System.in);
		System.out.println("\nDegete a stru7ing");
		opa = in.nextLine();
		
		return opa;
	}
	
}
