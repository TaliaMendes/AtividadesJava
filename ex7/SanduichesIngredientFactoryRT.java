package ex7;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory {
	
	@Override
	public PaoBola criarPao() {
		return new PaoBola();
	}
	
	@Override
	public QueijoCheddar criarQueijo() {
		return new QueijoCheddar();
	}
	
	@Override
	public PresuntoDePeru criarPresunto() {
		return new PresuntoDePeru();
	}
	
	@Override
	public SemVerdura criarSalada() {
		return new SemVerdura();
	}
}
