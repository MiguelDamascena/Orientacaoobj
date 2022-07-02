package br.com.fiap.FabricadeVeiculos;

public  abstract class Veiculos {
	protected String marca,roda,cambio,motor,cor,renavam;	
	protected int  anoFabricao,anoModelo;
	protected double velocidade;
	protected boolean confirmacao = false;
	protected double tanque;
	protected double capacidadeltrs;
	

	
	public Veiculos(String marca, String roda, String cambio, String motor, String cor, String renavam, int anoFabricao,
			int anoModelo, double velocidade, double tanque, double capacidadeltrs) {
		super();
		this.marca = marca;
		this.roda = roda;
		this.cambio = cambio;
		this.motor = motor;
		this.cor = cor;
		this.renavam = renavam;
		this.anoFabricao = anoFabricao;
		this.anoModelo = anoModelo;
		this.velocidade = velocidade;
		this.tanque = tanque;
		this.capacidadeltrs = capacidadeltrs;
	}

	public void ligar() {
		if(confirmacao == true) {
		System.out.println("Veiculo ligado");}
		else {
			confirmacao = true;
		}
	}
	
	public void desligar() {
		if(confirmacao == false) {
			System.out.println("Veiculo desligado");}
			else {
				confirmacao = false;
			}
	}
	public void acelerar(double aceleracao) {
		if(confirmacao == true) {
			if (this.velocidade + aceleracao  <=  220)
			this.velocidade += aceleracao;
			System.out.println("Velocidade atual: " + this.velocidade + "Km/h");
			System.out.println("Aceleração: " + aceleracao + "Km/h");
		}else {
			ligar();
			acelerar(aceleracao);
			System.out.println("velocidade superior permitida");
		}
	}
	
	public void frear(double aceleracao) {
		if(confirmacao == true) {
			this.velocidade -= aceleracao;
			System.out.println("O carro freio");
		}else {
			System.out.println("O carro esta desligado");
		
			
		}}
	
	public void abastecer (Combustivel combustivel,double Qtdlitros) {
		if (Qtdlitros<50);
		this.tanque += Qtdlitros;
		this.capacidadeltrs = combustivel.abastecer(Qtdlitros);
	}
	
	public abstract void exibirDados();
}
