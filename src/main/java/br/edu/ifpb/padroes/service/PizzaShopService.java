package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosService;
import br.edu.ifpb.padroes.api.damenos.proxy.DamenosServiceProxy;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotService;
import br.edu.ifpb.padroes.api.pizzahot.proxy.PizzaHotServiceProxy;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.adapter.DamenosAdapter;
import br.edu.ifpb.padroes.domain.adapter.PizzahotAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaShopService {

    private DamenosService damenosService;
    private PizzaHotService pizzaHotService;

    public PizzaShopService() {
        damenosService = new DamenosServiceProxy();
        pizzaHotService = new PizzaHotServiceProxy();
    }

    public void orderPizza(Pizza pizza) {

        Float totalPrice = pizza.getPrice();
        String name = pizza.getName();

        System.out.println(String.format("New order for = %s", name));
        System.out.println(String.format("Total price = %f", totalPrice));

    }

    public List<DamenosPizza> getPizzasDamenos() {
        return damenosService.getPizzas();
    }

    public List<PizzaHotPizza> getPizzasPizzaHot() {
        return pizzaHotService.getPizzas();
    }

    public List<Pizza> getPizzas(){
        List<Pizza> pizzas = new ArrayList<>();
        List<DamenosPizza> damenosPizzas = damenosService.getPizzas();
        pizzas.addAll(damenosPizzas
                .stream()
                .map( damenosPizza -> new DamenosAdapter(damenosPizza))
                .collect(Collectors.toList()));

        List<PizzaHotPizza> pizzaHotPizzas = pizzaHotService.getPizzas();
        pizzas.addAll(pizzaHotPizzas
                .stream()
                .map( pizzaHotPizza -> new PizzahotAdapter(pizzaHotPizza))
                .collect(Collectors.toList()));

        return pizzas;
    }

}
