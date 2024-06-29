package basico;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carros = {"Uno" , "Vectra" , "Marea" , "Fusca" , "Opala" };
		
		System.out.println("Carro Escolhido: " + carros [3]);
		
		//4 posições =  0,1,2,3
		String[] jogos = new String[4];
		jogos[0] = "Reade Deade 2";
		jogos[1] = "Minecraft";
	    jogos[2] = "GTA";
		jogos[3] = "FNAF-";
		
		for (int i = 0; i < jogos.length; i++ ) {
			System.out.println(jogos[i]);
		}
				
									
}}
