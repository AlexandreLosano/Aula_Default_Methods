package aplicaaco;

import java.util.Locale;
import java.util.Scanner;

import servico.TaxaDeEmprestimo;
import servico.TaxaDeEmprestimoEua;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Montante ");
		double montante = sc.nextDouble();
		System.out.print("Mêses ");
		int meses = sc.nextInt();
		
		TaxaDeEmprestimo taxa = new TaxaDeEmprestimoEua(1.0);
		double pagamento = taxa.pagamento(montante, meses);
		
		System.out.println("Pagamento Futuro " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		sc.close();
	}

}