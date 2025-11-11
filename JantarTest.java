import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JantarTest {

    private Jantar jantar;

    @BeforeEach
    void setUp() {
  
        jantar = new Jantar(1000, 1500);
        jantar.iniciarJantar();
    }

    @Test
    void testFilosofosExistem() {

        assertEquals(5, jantar.getFilosofos().length, "Deve haver 5 filósofos");


        for (Fisolofo f : jantar.getFilosofos()) {
            assertNotNull(f, "O filósofo não deve ser nulo");
        }
    }

    @Test
    void testGarfosExistem() {
        assertEquals(5, jantar.getGarfos().length, "Deve haver 5 garfos");

        for (int i = 0; i < jantar.getGarfos().length; i++) {
            for (int j = i + 1; j < jantar.getGarfos().length; j++) {
                assertNotSame(jantar.getGarfos()[i], jantar.getGarfos()[j],
                        "Garfos não devem ser o mesmo objeto");
            }
        }
    }

    @Test
    void testFalhaProposital() {
        fail("Teste propositalmente falhando para cumprir requisito da tarefa");
    }
}
