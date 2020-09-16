/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

 */
package application;

import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("Nome do cliente: ");
		cliente.nome = sc.next();
		
		System.out.println("CPF do cliente: ");
		cliente.cpf = sc.next();
		
		System.out.println("Sexo do cliente: ");
		cliente.sexo = sc.next().toUpperCase().charAt(0);
		
		
		System.out.println("Telefone do cliente: ");
		cliente.telefone = sc.next();
		
		System.out.println("Número da conta: ");
		cliente.conta = sc.next();
		
		cliente.cadastro();
		
		sc.close();
		
	}

}
