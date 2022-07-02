package br.com.fiap.FabricadeVeiculos;

public interface Combustivel {
	
	public double abastecer (double Qtdlitros);
	public class Gasolina implements Combustivel {

		@Override
		public double abastecer(double Qtdlitros) {
			// TODO Auto-generated method stub
			return Qtdlitros *10;
		}

	}

	
	public class Alcool implements Combustivel{

		@Override
		public double abastecer(double Qtdlitros) {
			// TODO Auto-generated method stub
			return Qtdlitros *7.5;
		}
	}
}
