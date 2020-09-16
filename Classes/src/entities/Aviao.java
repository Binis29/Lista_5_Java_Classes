package entities;

public class Aviao {
	
	private String modelo;
	private String companhiaAerea;
	private String numeroDeRegistro;
	
	private char tanque;
	
	
	
	public Aviao() {
		
	}
	
	
	public Aviao(String modelo, String companhiaAerea, String numeroDeRegistro, char tanque) {
		super();
		this.modelo = modelo;
		this.companhiaAerea = companhiaAerea;
		this.numeroDeRegistro = numeroDeRegistro;
		this.tanque = tanque;
	}






	public String getModelo() {
		return modelo;
	}






	public void setModelo(String modelo) {
		this.modelo = modelo;
	}






	public String getCompanhiaAerea() {
		return companhiaAerea;
	}






	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}






	public String getNumeroDeRegistro() {
		return numeroDeRegistro;
	}






	public void setNumeroDeRegistro(String numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}






	public char getTanque() {
		return tanque;
	}






	public void setTanque(char tanque) {
		this.tanque = tanque;
	}






	public void estado () {
		
		if (getTanque() == 'S') {
			System.out.println("Tanque cheio! Avião pronto pra decolar!");
			
	
		} else {
			System.out.println("Tanque vazio! Encha o tanque!");
			
		}
		
		
	}
	
	public void impressao() {
		System.out.println("Modelo: "+ getModelo());
		System.out.println("Companhia Aerea: " + getCompanhiaAerea());
		System.out.println("Numero de Registro: " + getNumeroDeRegistro());
	}
	

}
