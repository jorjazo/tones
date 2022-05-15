package cl.bodoque.tones.model;

import java.util.List;

import lombok.Getter;

@Getter
public class EscalaMenor extends EscalaAbstracta {

    public static final List<Double> OFFSETS = List.of(1d, 0.5d, 1d, 1d, 0.5d, 1d, 1d);

    public EscalaMenor(Tono base) {
        super(base, OFFSETS);
    }

}
