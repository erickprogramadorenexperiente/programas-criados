package exercicios_09_11;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// leia  um  n�mero  inteiro  e  informe  ao  final  se  o  n�mero  lido  � primo ou n�o.
		Scanner leitura = new Scanner (System.in);
		
		int primo = 0;
		System.out.println (" Escreva um n�mero: ");
		int numero = leitura.nextInt();
		for(int i=1;i<=numero;i=i+1) {
			if (numero%1==0) {
				primo +=1;
			}
		}
		if (primo==2) {
			System.out.println (numero+ " � primo! ");
		}else {
			System.out.println (" n�o � primo! ");
		} 
		
          leitura.close();
	}

}
