package entities;

public class PessoaJuridica extends Contribuinte {

	private int qtdFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, int qtdFuncionarios) {
		super(nome, rendaAnual);
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(int qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	@Override
	public Double impostoPago() {
		double impostoPago = 0.0;
		if (qtdFuncionarios < 10) {
			impostoPago = super.getRendaAnual() * (16.0 / 100);
		} else {
			impostoPago = super.getRendaAnual() * (14.0 / 100);
		}
		return impostoPago;
	}
	
	@Override
	public String toString() {
		return super.getNome() + String.format(": $ %.2f", this.impostoPago());
	}

}
