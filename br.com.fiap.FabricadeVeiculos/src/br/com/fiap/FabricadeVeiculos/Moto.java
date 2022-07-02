package br.com.fiap.FabricadeVeiculos;

public class Moto extends Veiculos {
	private String carenagem,pezinho,freios;
	

	
	public Moto(String marca, String roda, String cambio, String motor, String cor, String renavam, int anoFabricao,
			int anoModelo, double velocidade, double tanque, double capacidadeltrs, String carenagem, String pezinho,
			String freios) {
		super(marca, roda, cambio, motor, cor, renavam, anoFabricao, anoModelo, velocidade, tanque, capacidadeltrs);
		this.carenagem = carenagem;
		this.pezinho = pezinho;
		this.freios = freios;
	}

	
	
@Override
public void exibirDados() {
	
}	
}

