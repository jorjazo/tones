package cl.bodoque.tones.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import org.junit.jupiter.api.Test;

public class AcordeMayorTest {

    @Test
    public void testAcordeMayor() {
        assertThat(new AcordeMayor(Tono.DO).getTonos(), contains(Tono.DO, Tono.MI, Tono.SOL));
    }

}
