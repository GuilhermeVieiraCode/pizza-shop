package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;


public class DamenosServiceProxy implements DamenosService {
    DamenosServiceImpl damenosService;
    List<DamenosPizza> damenosCache = new ArrayList<>();

    @Override
    public List<DamenosPizza> getPizzas() {
        if(damenosCache.isEmpty()){
            this.damenosCache = this.damenosService.getPizzas();
        }
        return this.damenosCache;
    }
}
