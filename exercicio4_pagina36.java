package exercicios_pagina36while;

import java.util.Scanner;

public class exercicio4_pagina36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		int numero,fatorial = 1;
		
		System.out.println (" escreva um valor: ");
		numero = leitura.nextInt();
		for (;numero>=1;numero = numero-1) {
			fatorial = fatorial * numero;  

	    }
		 System.out.println (" o resultado do fatorial  é de: " +fatorial);
         leitura.close();
   }		 
}
