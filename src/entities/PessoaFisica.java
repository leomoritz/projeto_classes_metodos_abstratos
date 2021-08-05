package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double impostoPago() {
		double totalImposto = 0.0;
		double abatimentoSaude = 0.0;
		if (super.getRendaAnual() < 2000.00) {
			totalImposto = super.getRendaAnual() * (15.0 / 100);
		} else {
			totalImposto = super.getRendaAnual() * (25.0 / 100);
		}

		if (gastosSaude > 0) {
			abatimentoSaude = gastosSaude * (50.0 / 100);
		}
		//double impostoPago = totalImposto - abatimentoSaude;
		return totalImposto - abatimentoSaude;
	}

	@Override
	public String toString() {
		return super.getNome() + String.format(": $ %.2f", this.impostoPago());
	}
	
	

}
