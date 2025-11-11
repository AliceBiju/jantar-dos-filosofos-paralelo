import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JantarTest {

    private Jantar jantar;

    @BeforeEach
    void setUp() {
        jantar = new Jantar();
        jantar.iniciar();
    }

    @Test
    void testFilosofosEConfiguração() {
        
        assertEquals(5, jantar.getFilosofos().length, "Deve haver 5 filósofos");

       
        for (Fisolofo fisolofo : jantar.getFilosofos()) {
            assertNotNull(fisolofo, "O filósofo não deve ser nulo");
            assertNotNull(fisolofo.getGarfoEsquerdo(), "O filósofo deve ter o garfo esquerdo");
            assertNotNull(fisolofo.getGarfoDireito(), "O filósofo deve ter o garfo direito");
        }
    }

    @Test
    void testGarfosEConfiguração() {
        
        assertEquals(5, jantar.getGarfos().length, "Deve haver 5 garfos");

        
        for (int i = 0; i < jantar.getGarfos().length; i++) {
            for (int j = i + 1; j < jantar.getGarfos().length; j++) {
                assertNotSame(jantar.getGarfos()[i], jantar.getGarfos()[j], "Os garfos não devem ser o mesmo objeto");
            }
        }
    }
}

