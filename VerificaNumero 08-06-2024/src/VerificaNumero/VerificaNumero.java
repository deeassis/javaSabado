package VerificaNumero;



public class VerificaNumero {

	public static void main(String[] args) {
		String texto = "Valor texto";
		int inteiro = 11;
		// Comentario quebrado
		double quebrado = 10.5;
		/**
		 * comentario maior
		 */
		System.out.println(texto);
		//Estrutura de decisao
		if (inteiro > 10) {
			// > maior, < menor, == igual
			// >= maiorIgual, >= menorIgual
			// !=diferente
			System.out.println("Número inteiro "  + "é maior");
		} else {
			System.out.println("Não é maior");
		
		}
		
		Scanner canner = new Scanner(System.in);
		System.out.println("Qual e o numero ?");
		inteiro = canner.nextInt();
		System.out.println(inteiro);
		if(inteiro>10) {
			System.out.println("Maior que 10");
		} else {
			System.out.println("Menor que 10");
		}
		}
	

}
