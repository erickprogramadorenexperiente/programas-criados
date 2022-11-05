package exercicios2310;

import java.util.Scanner;

public class exercicio2_2310 {

	public static void main(String[] args) {
		// PROGRAMA IDADE DO USUARIO
		Scanner leitura = new Scanner (System.in);
		int anonasc,anoatu,idade,i = 1;
		
		do {
			System.out.println ("escreva o ano atual:");
			anoatu = leitura.nextInt();
			System.out.println ("Escreva o seu ano de nascimento:");
			anonasc = leitura.nextInt();
			idade = anoatu - anonasc;
			System.out.println ("sua idade é:" +idade);
			if(idade>=18){
				System.out.println ("maior de idade!");
			}
			else {
				System.out.println ("menor de idade!");
			}
			
		i = i+1;
	        System.out.println ("quer continuar a execução do programa? digite 1 para SIM, 2 para NÃO");
	        i = leitura.nextInt();
		}while(i!=2);
		
		leitura.close();

	}

}
