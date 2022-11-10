package exercicios_09_11;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de 15 pessoas e calcule e mostre;
		Scanner leitura = new Scanner (System.in);
		
		int faixaum=0,faixadois=0,faixatres=0,faixaquatro=0,faixacinco=0;
		for (int i=1;i<=15;i=i+1) {
			System.out.println (" Digite a idade da " +i+ " pessoa: ");
			int idade = leitura.nextInt();
		    if (idade<=15) {
		      	faixaum += +1;
		    }else if(idade<=30) {
		    	faixadois += +1;
		    }else if(idade<=45){
		    	faixatres += +1;
		    }else if(idade<=60) {
		    	faixaquatro += +1;
		    }else {
		    	faixacinco += +1;
		    }
		}
		    System.out.println (" 1° faixa etária tem " +faixaum+ " pessoas que demonstram: " + (100*faixaum/10) + "%");
		    System.out.println (" 2° faixa etária tem " +faixadois+ " pessoas que demonstram: " + (100*faixadois/10) + "%"); 
		    System.out.println (" 3° faixa etária tem " +faixatres+ " pessoas que demonstram: " + (100*faixatres/10) + "%");
		    System.out.println (" 4° faixa etária tem " +faixaquatro+ " pessoas que demonstram: " + (100*faixaquatro/10) + "%");
		    System.out.println (" 5° faixa etária tem " +faixacinco+ " pessoas que demonstram: " + (100*faixacinco/10) + "%");
		    
		 leitura.close();   

	}

}
