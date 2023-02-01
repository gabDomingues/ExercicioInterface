package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	
	private Integer numeroContrato;
	private LocalDate dataContrato;
	private Double valorContrato;
	
	private List<Parcelamento> parcelas = new ArrayList<>();

	public Contrato(Integer numeroContrato, LocalDate dataContrato, Double valorContrato) {
		super();
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

	public List<Parcelamento> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcelamento> parcelas) {
		this.parcelas = parcelas;
	}
	
	
	
}
