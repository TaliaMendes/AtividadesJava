package ex7;

public class TestSanduiche {

	public static void main(String[] args) {
		
		SanduichesIngredientFactory sanduicheCG = new SanduichesIngredientFactoryCG();
		Sanduiche fabrica = new Sanduiche(sanduicheCG);
		fabrica.montarSanduiche();
	}
}
