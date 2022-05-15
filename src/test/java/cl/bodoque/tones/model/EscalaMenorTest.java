package cl.bodoque.tones.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class EscalaMenorTest {

    @Test
    public void testEscalaMenor() {
        Escala escala = new EscalaMenor(Tono.DO);
        assertThat(escala.getTonoBase(), equalTo(Tono.DO));
        assertThat(escala.getTonos().size(), equalTo(8));
        assertThat(escala.getTonos(), contains(Tono.DO, Tono.RE, Tono.RE_S, Tono.FA, Tono.SOL, Tono.SOL_S, Tono.LA_S, Tono.DO));
        
        assertThat(new EscalaMenor(Tono.LA).getTonos(), contains(Tono.LA, Tono.SI, Tono.DO, Tono.RE, Tono.MI, Tono.FA, Tono.SOL, Tono.LA));
    }

}
