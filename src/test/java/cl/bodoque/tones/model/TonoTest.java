package cl.bodoque.tones.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class TonoTest {

    @Test
    public void testMasTonos() {
        assertThat(Tono.DO.masTonos(0.5).get(), equalTo(Tono.DO_S));
        assertThat(Tono.FA.masTonos(0.5).get(), equalTo(Tono.FA_S));
        assertThat(Tono.SI.masTonos(0.5).get(), equalTo(Tono.DO));
        
        assertThat(Tono.DO.masTonos(1).get(), equalTo(Tono.RE));
        assertThat(Tono.RE.masTonos(1).get(), equalTo(Tono.MI));
        assertThat(Tono.MI.masTonos(0.5).get(), equalTo(Tono.FA));
        assertThat(Tono.FA.masTonos(1).get(), equalTo(Tono.SOL));
        assertThat(Tono.SOL.masTonos(1).get(), equalTo(Tono.LA));
        assertThat(Tono.LA.masTonos(1).get(), equalTo(Tono.SI));
        assertThat(Tono.SI.masTonos(0.5).get(), equalTo(Tono.DO));
        
    }

}
