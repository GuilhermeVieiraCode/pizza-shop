package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheeseDecorator extends PizzaBaseDecorator{
    public ExtraCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice(){
        return pizza.getPrice() * 1.10f;
    }

    @Override
    public String getName() {
        return pizza.getName() + " (extra cheese)";
    }
}
