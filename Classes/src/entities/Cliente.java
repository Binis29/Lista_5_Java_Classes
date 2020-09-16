
/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

 */
package entities;

public class Cliente {
	
	public String nome;
	public String cpf;
	public String telefone;
	public char sexo;
	public String conta;
	
	
	public Cliente() {
		
	}

	public Cliente(String nome, String cpf, char sexo, String conta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.conta = conta;
	
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public String getConta() {
		return conta;
	}



	public void setConta(String conta) {
		this.conta = conta;
	}
	


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastro() {
		
		if(getSexo() == 'F') {
			System.out.println("*******Cliente cadastrada com sucesso!*******");
		} else if (getSexo() == 'M') {
			System.out.println("*******Cliente cadastrado com sucesso!*******");
		}
		
		System.out.println("Cliente: " + getNome());
		System.out.println("Cpf: " + getCpf());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Número da conta: " + getConta());
		
		
	}

}
