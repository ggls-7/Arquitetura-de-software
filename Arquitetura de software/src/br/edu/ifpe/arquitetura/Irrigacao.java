package br.edu.ifpe.arquitetura;

public class Irrigacao implements IRComando {
	boolean modo;
	String area;
	

	@Override
	public void Ligar() {
	this.modo = true;
	System.out.println(this.area + " est� com o sistema de irriga��o ligado");
	}
	@Override
	public void Desligar() {
	this.modo = false;
	System.out.println(this.area + " est� com o sistema de irriga��o desligado");
	}
	
	}

 
