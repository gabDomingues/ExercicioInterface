package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline{

	@Override
	public double taxa(double valor) {
		
		return 0;
	}

	@Override
	public double juros(double valor, int meses) {
		
		return 0;
	}
	
}