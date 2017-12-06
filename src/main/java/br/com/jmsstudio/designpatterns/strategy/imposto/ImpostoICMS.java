package br.com.jmsstudio.designpatterns.strategy.imposto;

import br.com.jmsstudio.designpatterns.decorator.imposto.Imposto;
import br.com.jmsstudio.model.Orcamento;

public class ImpostoICMS extends Imposto {

    public static final double TAXA_IMPOSTO = 0.06;

    public ImpostoICMS(Imposto impostoCombinado) {
        super(impostoCombinado);
    }

    public ImpostoICMS() {
        super();
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * TAXA_IMPOSTO + calculaImpostoCombinado(orcamento);
    }
}
