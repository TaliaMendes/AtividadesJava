package ex8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomadorAdaptador implements SomadorEsperado {

	private SomadorExistente somador;

    public SomadorAdaptador(SomadorExistente somador) {
        this.somador = somador;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = Arrays.stream(vetor).boxed().collect(Collectors.toList());
        return somador.somaLista(lista);
    }
}
