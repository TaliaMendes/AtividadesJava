package ex5;

public class TesteSanduiches {

	public static void main(String[] args) {
		
		FabricaDeSanduiche fabrica =  new FabricaDeSanduiche();
		Sanduiche s = fabrica.imprimirPedido("CG");
		s.montarSanduiche();
	}
}
