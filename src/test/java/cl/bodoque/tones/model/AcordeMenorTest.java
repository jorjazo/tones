package cl.bodoque.tones.model;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class AcordeMenorTest {

    @Test
    public void testAcordeMenor() {
        assertThat(new AcordeMenor(Tono.DO).getTonos(), contains(Tono.DO, Tono.RE_S, Tono.SOL));
    }

}
