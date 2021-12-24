package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PizzaHotServiceProxy implements PizzaHotService {
    PizzaHotServiceImpl pizzaHotService;
    List<PizzaHotPizza> pizzaHotCache = new ArrayList<>();

    @Override
    public List<PizzaHotPizza> getPizzas() {
        if(pizzaHotCache.isEmpty()){
            this.pizzaHotCache = this.pizzaHotService.getPizzas();
        }
        return this.pizzaHotCache;
    }
}
