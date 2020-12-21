package br.edu.ifpe.arquitetura;

public class Irrigacao implements IRComando {
	boolean modo;
	String area;
	

	@Override
	public void Ligar() {
	this.modo = true;
	System.out.println(this.area + " está com o sistema de irrigação ligado");
	}
	@Override
	public void Desligar() {
	this.modo = false;
	System.out.println(this.area + " está com o sistema de irrigação desligado");
	}
	
	}

 
