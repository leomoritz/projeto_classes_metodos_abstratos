package entities;

public abstract class Contribuinte {

	private String nome;
	private Double rendaAnual;
	// private Double totalImposto;

	public Contribuinte() {
	}

	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public abstract Double impostoPago();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	/*
	 * public Double getTotalImposto() { return totalImposto; }
	 * 
	 * public void setTotalImposto(Double totalImposto) { this.totalImposto +=
	 * totalImposto; }
	 */

}
