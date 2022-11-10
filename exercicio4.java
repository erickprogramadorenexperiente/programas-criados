package exercicios_09_11;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// sequência de fibonacci.
		Scanner leitura = new Scanner (System.in);
		
		int valor1=1,valor2=0,termo;
	    System.out.println (" digite o termo desejado: ");
	    termo = leitura.nextInt();
	    System.out.println (" a sequencia de fibonacci é igual a: ");
	    System.out.println (valor1);
	    for (int i=1; i<termo; i++) {
	    	valor1 = valor1 + valor2;
	    	valor2 = valor1 - valor2;
	    	System.out.println (valor1);
	    }
	
         leitura.close();
	}

}
