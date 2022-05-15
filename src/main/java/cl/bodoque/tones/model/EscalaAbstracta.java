package cl.bodoque.tones.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class EscalaAbstracta implements Escala {
    private List<Tono> tonos;

    public EscalaAbstracta(Tono base, List<Double> offsets) {
        tonos = new ArrayList<Tono>(offsets.size() + 1);
        tonos.add(base);
        Tono actual = base;
        for(Double offset: offsets) {
            actual = actual.masTonos(offset).orElseThrow(() -> new IllegalStateException("No hay tono"));
            tonos.add(actual);
        }
           
    }
    
    @Override
    public Tono getTonoBase() {
        return tonos.get(0);
    }
}
