package cl.bodoque.tones.web;

import java.util.Map;
import java.util.function.Function;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.bodoque.tones.model.Escala;
import cl.bodoque.tones.model.EscalaMayor;
import cl.bodoque.tones.model.EscalaMenor;
import cl.bodoque.tones.model.Tono;

@Controller
@RequestMapping("escalas")
public class EscalaController {
    private static final Map<String, Function<Tono, Escala>> NOMBRE_A_ESCALA = Map.of(
            "mayor", EscalaMayor::new,
            "menor", EscalaMenor::new
            );
    
    @GetMapping("/{nombreEscala}/{tonoBase}")
    public String generarEscala(@PathVariable("nombreEscala") String nombreEscala, @PathVariable("tonoBase") Tono base, ModelMap model) {
        Escala escala = NOMBRE_A_ESCALA.get(nombreEscala).apply(base);
        model.addAttribute("escala", escala);
        return "escala";
    }
}
