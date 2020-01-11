package servico;

public class TaxaDeEmprestimoBrasileiro implements TaxaDeEmprestimo{

	private double taxaJuros;

	public TaxaDeEmprestimoBrasileiro(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaDeEmprestimo() {
		return taxaJuros;
	}
	

}
