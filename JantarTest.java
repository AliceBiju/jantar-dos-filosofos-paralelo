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
        Fisolofo[] filosofos = jantar.getFilosofos();
        assertEquals(5, filosofos.length, "Deve haver 5 filósofos");

        for (Fisolofo f : filosofos) {
            assertNotNull(f, "Filósofo não deve ser nulo");
            assertNotNull(f.getGarfoEsquerdo(), "Filósofo deve ter garfo esquerdo");
            assertNotNull(f.getGarfoDireito(), "Filósofo deve ter garfo direito");
        }
    }

    @Test
    void testGarfosExistem() {
        Garfo[] garfos = jantar.getGarfos();
        assertEquals(5, garfos.length, "Deve haver 5 garfos");

        for (int i = 0; i < garfos.length; i++) {
            for (int j = i + 1; j < garfos.length; j++) {
                assertNotSame(garfos[i], garfos[j], "Garfos não devem ser o mesmo objeto");
            }
        }
    }

    @Test
    void testFilosofosPegamGarfosCorretamente() {
        Fisolofo[] filosofos = jantar.getFilosofos();
        for (int i = 0; i < filosofos.length; i++) {
            Fisolofo f = filosofos[i];
            Garfo esquerdo = f.getGarfoEsquerdo();
            Garfo direito = f.getGarfoDireito();


            int idDireitoEsperado = (esquerdo.getId() + 1) % 5;
            assertEquals(idDireitoEsperado, direito.getId(),
                    "O garfo direito deve ser o próximo na mesa em relação ao garfo esquerdo");
        }
    }
}
