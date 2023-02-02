package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dataParcela;
	private Double valorParcela;
	
	public Parcelamento(LocalDate dataParcela, Double valorParcela) {
		this.dataParcela = dataParcela;
		this.valorParcela = valorParcela;
	}

	public LocalDate getDataParcela() {
		return dataParcela;
	}

	public void setDataParcela(LocalDate dataParcela) {
		this.dataParcela = dataParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	@Override
	public String toString() {
		return dataParcela.format(fmt) +  " - " + String.format("%.2f",valorParcela);
	}
	
	
	
}
