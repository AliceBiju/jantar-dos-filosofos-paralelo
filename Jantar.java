public class Jantar {
    private Fisolofo[] filosofos;
    private Garfo[] garfos;

    public void iniciar() {
        // Inicializa o ambiente com 5 filósofos e 5 garfos
        garfos = new Garfo[5];
        filosofos = new Fisolofo[5];

        // Cria 5 garfos
        for (int i = 0; i < 5; i++) {
            garfos[i] = new Garfo();
        }

        // Cria 5 filósofos, cada um com dois garfos
        for (int i = 0; i < 5; i++) {
            Garfo garfoEsquerdo = garfos[i];
            Garfo garfoDireito = garfos[(i + 1) % 5];
            filosofos[i] = new Fisolofo(garfoEsquerdo, garfoDireito);
        }
    }

    public Fisolofo[] getFilosofos() {
        return filosofos;
    }

    public Garfo[] getGarfos() {
        return garfos;
    }
}
