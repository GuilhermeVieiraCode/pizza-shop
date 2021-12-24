package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizzaDecorator extends PizzaBaseDecorator{
    PanPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice() * 1.15f;
    }

    @Override
    public String getName() {
        return pizza.getName() + " (pan pizza)";
    }
}
