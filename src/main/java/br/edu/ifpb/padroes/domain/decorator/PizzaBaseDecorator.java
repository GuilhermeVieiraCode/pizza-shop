package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PizzaBaseDecorator implements Pizza {
    Pizza pizza;

    PizzaBaseDecorator(Pizza pizza){
        this.pizza = pizza;
    }


    @Override
    public Float getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
