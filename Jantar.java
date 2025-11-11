public class Jantar {
    private final Fisolofo[] filosofos;
    private final Garfo[] garfos;
    private final int NUM_FILOSOFOS = 5;

    public Jantar(int tempoPensar, int tempoComer) {
        garfos = new Garfo[NUM_FILOSOFOS];
        filosofos = new Fisolofo[NUM_FILOSOFOS];


        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            garfos[i] = new Garfo(i);
        }

    
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            Garfo garfoEsquerdo = garfos[i];
            Garfo garfoDireito = garfos[(i + 1) % NUM_FILOSOFOS];
            filosofos[i] = new Fisolofo(i, garfoEsquerdo, garfoDireito, tempoPensar, tempoComer);
        }
    }

    public void iniciarJantar() {
        for (Fisolofo f : filosofos) {
            f.start();
        }
    }

    public Fisolofo[] getFilosofos() {
        return filosofos;
    }

    public Garfo[] getGarfos() {
        return garfos;
    }
}

