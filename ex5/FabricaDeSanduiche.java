package ex5;

public class FabricaDeSanduiche {

	public Sanduiche imprimirPedido(String tipo) {
		if(tipo == "CG") {
			return new SanduicheCG();
		}
		else if(tipo == "JP") {
			return new SanduicheJP();
		}
		else if(tipo == "RT") {
			return new SanduicheRT();
		}
		else {
			return new Sanduiche();
		}
	}


}
