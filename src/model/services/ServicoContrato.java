package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcelamento;

public class ServicoContrato {
	
	private ServicoPagamentoOnline servicoOnline;;
	
	public ServicoContrato(ServicoPagamentoOnline servicoOnline) {
		this.servicoOnline = servicoOnline;
	}

	public void processarContrato(Contrato contrato, int meses) {
		
		double valorInicial = contrato.getValorContrato()/meses;
		
		for(int i = 1 ; i <= meses; i++) {
			
			LocalDate vencimento = contrato.getDataContrato().plusMonths(i);
			double valorJuros = servicoOnline.juros(valorInicial, i);
			double taxa = servicoOnline.taxaPagamento(valorJuros);
			
			contrato.getParcelas().add(new Parcelamento(vencimento, taxa));
		}
	}
}
