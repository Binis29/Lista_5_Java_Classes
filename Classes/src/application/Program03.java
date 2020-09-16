package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.setNome(sc.next());
		
		
		System.out.println("Sobrenome: ");
		funcionario.setSobrenome(sc.next());
		
		System.out.println("Setor: ");
		funcionario.setSetor(sc.next());
		
		System.out.println("Idade: ");
		funcionario.setIdade(sc.nextInt());
		
		System.out.println("CPF: ");
		funcionario.setCpf(sc.next());
		
		System.out.println("Salário: ");
		funcionario.setSalario(sc.nextDouble());
		
		System.out.println(funcionario.getSalario());
		
		System.out.println(funcionario.toString());
		
		sc.close();

	}

}
