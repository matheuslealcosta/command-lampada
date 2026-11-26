package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ControleRemotoTest {

    ControleRemoto controle;
    Lampada lampada;

    @BeforeEach
    void setUp() {
        controle = new ControleRemoto();
        lampada = new Lampada("Sala");
    }

    @Test
    void deveLigarLampada() {
        Comando ligarLampada = new LigarLampadaComando(lampada);
        controle.executarComando(ligarLampada);

        assertEquals("Lâmpada ligada", lampada.getSituacao());
    }

    @Test
    void deveDesligarLampada() {
        Comando desligarLampada = new DesligarLampadaComando(lampada);
        controle.executarComando(desligarLampada);

        assertEquals("Lâmpada desligada", lampada.getSituacao());
    }

    @Test
    void deveCancelarDesligamentoLampada() {
        Comando ligarLampada = new LigarLampadaComando(lampada);
        Comando desligarLampada = new DesligarLampadaComando(lampada);

        controle.executarComando(ligarLampada);
        controle.executarComando(desligarLampada);

        controle.cancelarUltimoComando();

        assertEquals("Lâmpada ligada", lampada.getSituacao());
    }

}
