package cl.bodoque.tones.model;

import java.util.List;

import lombok.Getter;

@Getter
public class EscalaMayor extends EscalaAbstracta {

    public static final List<Double> OFFSETS = List.of(1d, 1d, 0.5, 1d, 1d, 1d, 0.5d);

    public EscalaMayor(Tono base) {
        super(base, OFFSETS);
    }

}
