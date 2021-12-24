package br.edu.ifpb.padroes.domain.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCouponDecorator extends PizzaBaseDecorator{

    public DiscountCouponDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public Float getPrice(){
        Float totalPrice = pizza.getPrice();
        totalPrice = totalPrice - (totalPrice * 0.25f);
        return totalPrice;
    }
}
