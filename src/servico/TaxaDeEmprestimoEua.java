package servico;

public class TaxaDeEmprestimoEua implements TaxaDeEmprestimo{

	private double taxaJuros;

	public TaxaDeEmprestimoEua(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaDeEmprestimo() {
		return taxaJuros;
	}

}
