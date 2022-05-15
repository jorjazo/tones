package cl.bodoque.tones.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class Acorde {
    private List<Tono> tonos;
    
    public Acorde(Tono tonica, List<Double> offsets) {
        tonos = new ArrayList<Tono>(offsets.size() + 1);
        tonos.add(tonica);
        Tono actual = tonica;
        for(Double offset: offsets) {
            actual = actual.masTonos(offset).orElseThrow(() -> new IllegalStateException("No hay tono"));
            tonos.add(actual);
        }
    }
    
    public Tono getTonica() {
        return tonos.get(0);
    }
}
