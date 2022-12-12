package cl.bodoque.tones.model;

import java.util.List;

public class AcordeMayor extends AcordeAbstracto {
    public static final List<Double> OFFSETS = List.of(2d, 1.5);
    
    public AcordeMayor(Tono tonica) {
        super(tonica, OFFSETS);
    }
}
