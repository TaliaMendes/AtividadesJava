package ex7;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{
	
	@Override
	public PaoIntegral criarPao() {
		return new PaoIntegral();
	}
	
	@Override
	public QueijoPrato criarQueijo() {
		return new QueijoPrato();
	}
	
	@Override
	public PresuntoDeFrango criarPresunto() {
		return new PresuntoDeFrango();
	}

	@Override
	public SemVerdura criarSalada() {
		return new SemVerdura();
	}
}
