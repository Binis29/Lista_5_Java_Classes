package application;

import java.util.Scanner;

import entities.Aviao;

public class Program01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aviao aviao = new Aviao();
		
		System.out.println("Modelo do avião:");
		aviao.setModelo(sc.next());
		
		System.out.println("Companhia aérea:");
		aviao.setCompanhiaAerea(sc.next());
		
		System.out.println("Numero de registro:");
		aviao.setNumeroDeRegistro(sc.next());
		
		System.out.println("O tanque da aeronave está cheio?: ");
		System.out.println("\ns - Sim || n -Não");
		aviao.setTanque(sc.next().toUpperCase().charAt(0));
		
		System.out.println();
		
		
		
		
		aviao.impressao();
		aviao.estado();
		
		
	
		sc.close();

	}

}
