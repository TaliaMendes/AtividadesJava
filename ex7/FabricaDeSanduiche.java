package ex7;

class Sanduiche {
    private Pao pao;
    private Queijo queijo;
    private Presunto presunto;
    private Salada salada;

    public Sanduiche(SanduichesIngredientFactory fabrica) {
        pao = fabrica.criarPao();
        queijo = fabrica.criarQueijo();
        presunto = fabrica.criarPresunto();
        salada = fabrica.criarSalada();
    }
    
    
    public void montarSanduiche() {
        System.out.println("Sanduíche com " + pao + ", " + queijo + ", " + presunto + " e " + salada);
    }
    
}
