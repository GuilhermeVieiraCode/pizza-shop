package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrustDecorator extends PizzaBaseDecorator{
    public StuffedCrustDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice() * 1.20f;
    }

    @Override
    public String getName() {
        return pizza.getName() + " (stuffed crust)";
    }
}
