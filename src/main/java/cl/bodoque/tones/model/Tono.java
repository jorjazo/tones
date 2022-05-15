package cl.bodoque.tones.model;

import java.util.Optional;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Tono {
    DO (0),
    DO_S (0.5),
    RE (1),
    RE_S (1.5),
    MI (2),
    FA(2.5),
    FA_S (3),
    SOL(3.5),
    SOL_S(4),
    LA (4.5),
    LA_S(5),
    SI (5.5);
    
    /*
     * Offset absoluto desde la base (SI)
     */
    @Getter
    private double offset;
    
    public Optional<Tono> masTonos(double tonos) {
        double offsetAbsoluto = (tonos + this.offset) % 6;
        return Stream.of(values()).filter(it -> it.getOffset() == offsetAbsoluto).findFirst();
    }
}
