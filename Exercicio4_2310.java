package exercicios2310;

import java.util.Scanner;

public class Exercicio4_2310 {

	public static void main(String[] args) {
		// PROGRAMA: IDADE DO MAIS VELHO E DO MAIS NOVO
		Scanner leitura = new Scanner (System.in);
		int i,anoatu,anonasc,idad,novo = 200,velho = 0;
		
		System.out.println ("Escreva o ano atual:");
		anoatu = leitura.nextInt();
		for (i = 1;i<=10;i = i+1) {
			System.out.println ("Digite o ano em que você nasceu:");
			anonasc = leitura.nextInt();
			idad = anoatu - anonasc;
			System.out.println ("a sua idade será de:" +idad);
			if (velho<idad) {
			   velho = idad+0;
			}
			else if (novo>idad) {
			   novo = idad+0;
			   
			}
			
		}
		    System.out.println ("A pessoa mais nova possui" + novo + "anos");
		    System.out.println ("A pessoa mais velha possui" + velho + "anos");
		    
		    leitura.close();
		

	}

}
