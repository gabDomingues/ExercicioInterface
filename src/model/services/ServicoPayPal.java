package model.services;

public class ServicoPayPal implements ServicoPagamentoOnline{

	@Override
	public double taxaPagamento(double valor) {
		double taxa = 0.02;
		return (valor + (valor*taxa));
	}

	@Override
	public double juros(double valor, int meses) {
		
		return (valor + (valor*0.01*meses));
	}
	
}
