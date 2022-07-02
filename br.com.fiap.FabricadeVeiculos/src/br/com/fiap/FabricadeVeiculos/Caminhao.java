package br.com.fiap.FabricadeVeiculos;

public class Caminhao extends Veiculos  {
	
	private String eixos,carrocheiria;
	private int carga;
	
	
public Caminhao(String marca, String roda, String cambio, String motor, String cor, String renavam, int anoFabricao,
			int anoModelo, double velocidade, double tanque, double capacidadeltrs, String eixos, String carrocheiria,
			int carga) {
		super(marca, roda, cambio, motor, cor, renavam, anoFabricao, anoModelo, velocidade, tanque, capacidadeltrs);
		this.eixos = eixos;
		this.carrocheiria = carrocheiria;
		this.carga = carga;
	}



public void exibirDados() {
}



}
