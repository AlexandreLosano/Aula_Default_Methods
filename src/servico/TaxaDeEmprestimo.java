package servico;

import java.security.InvalidParameterException;

public interface TaxaDeEmprestimo {

	double getTaxaDeEmprestimo();

	
	default double pagamento(double montante, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return montante * Math.pow(1.0 + getTaxaDeEmprestimo() / 100.0, meses);
	}
	
}
