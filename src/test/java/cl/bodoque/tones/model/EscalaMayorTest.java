package cl.bodoque.tones.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class EscalaMayorTest {

    @Test
    public void testEscalaMayor() {
        Escala escala = new EscalaMayor(Tono.DO);
        assertThat(escala.getTonoBase(), equalTo(Tono.DO));
        assertThat(escala.getTonos().size(), equalTo(8));
        assertThat(escala.getTonos(), contains(Tono.DO, Tono.RE, Tono.MI, Tono.FA, Tono.SOL, Tono.LA, Tono.SI, Tono.DO));
        
        assertThat(new EscalaMayor(Tono.RE).getTonos(), contains(Tono.RE, Tono.MI, Tono.FA_S, Tono.SOL, Tono.LA, Tono.SI, Tono.DO_S, Tono.RE));
    }

}
