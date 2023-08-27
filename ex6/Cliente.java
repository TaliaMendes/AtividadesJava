package ex6;

public class Cliente {

	public static void main(String[] args) {
		
		  FabricaDeCarro fabricaFiat = new FabricaFiat();
	        FabricaDeCarro fabricaFord = new FabricaFord();

	        CarroSedan sedanFiat = fabricaFiat.criarCarroSedan();
	        CarroSedan sedanFord = fabricaFord.criarCarroSedan();

	        CarroPopular popularFiat = fabricaFiat.criarCarroPopular();
	        CarroPopular popularFord = fabricaFord.criarCarroPopular();

	        sedanFiat.exibirInfoSedan();
	        sedanFord.exibirInfoSedan();
	        popularFiat.exibirInfoPopular();
	        popularFord.exibirInfoPopular();
	    }
}
