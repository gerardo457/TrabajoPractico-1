package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
      	  
	  Scanner sc = new Scanner(System.in);
	  System.out.print("introduzca numero: ");
	  int num = sc.nextInt();
	  
	  if( num % 2 == 0) {
		 System.out.println(num*3); 
	  }else {
		 System.out.println(num*2); 
	  }
	}

}
