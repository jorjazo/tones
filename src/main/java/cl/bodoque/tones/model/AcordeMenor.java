package cl.bodoque.tones.model;

import java.util.List;

public class AcordeMenor extends AcordeAbstracto {
    public static final List<Double> OFFSETS = List.of(1.5, 2d);

    public AcordeMenor(Tono tonica) {
        super(tonica, OFFSETS);
    }
}
