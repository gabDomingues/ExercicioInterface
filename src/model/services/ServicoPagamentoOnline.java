package model.services;

public interface ServicoPagamentoOnline {
	
	public double taxa(double valor);
	public double juros(double valor, int meses);
}
