package br.com.fiap.FabricadeVeiculos;

public class Carro extends Veiculos {
	
	
	private String aerofolio;
	
	
public Carro(String marca, String roda, String cambio, String motor, String cor, String renavam, int anoFabricao,
		int anoModelo, double velocidade, double tanque, double capacidadeltrs, String aerofolio) {
	super(marca, roda, cambio, motor, cor, renavam, anoFabricao, anoModelo, velocidade, tanque, capacidadeltrs);
	this.aerofolio = aerofolio;
}



@Override
public void exibirDados() {
	System.out.println("Marca : " + this.marca);
	System.out.println("Modelo : " + this.anoModelo);
	System.out.println("Cor : " + this.cor);
	System.out.println("Ano de Fabricação : " + this.anoFabricao);
	System.out.println("Ano modelo : " + this.anoModelo);
	System.out.println("Renavam : " + this.renavam);
	System.out.println("Motor : " + this.motor);
	System.out.println("Cambio : " + this.cambio);
	System.out.println("Aro da Roda : " + this.roda);
	System.out.println("Velocidade : " + this.velocidade);
	System.out.println("Aerofolio : " + this.aerofolio);
	System.out.println("Tanque : " + this.tanque);
	System.out.println("capacidadeltrs : " + this.capacidadeltrs + "km");
}}







