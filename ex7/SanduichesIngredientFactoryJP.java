package ex7;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory {

	@Override
	public PaoFrances criarPao() {
		return new PaoFrances();
	}
	
	@Override
	public QueijoMussarela criarQueijo() {
		return new QueijoMussarela();
	}
	
	@Override
	public PresuntoDeFrango criarPresunto() {
		return new PresuntoDeFrango();
	}
	
	@Override
	public ComVerdura criarSalada() {
		return new ComVerdura();
	}
}
