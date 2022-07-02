package br.com.fiap.FabricadeVeiculos;

import br.com.fiap.FabricadeVeiculos.Combustivel.Gasolina;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Gasolina gasolina = new Gasolina();
		Carro carro1 = new Carro ("Masserati","17","8","V8","Azul","651216",2023,2023,300,10,76,"aerofolio" );     
		
		
		carro1.ligar();
		
		
		carro1.acelerar(100);
		carro1.abastecer(gasolina, 10);
	
		carro1.exibirDados();
	}
	

}
