public class Jantar {
    private Fisolofo[] filosofos;
    private Garfo[] garfos;

    public void iniciar() {
        
        garfos = new Garfo[5];
        filosofos = new Fisolofo[5];

       
        for (int i = 0; i < 5; i++) {
            garfos[i] = new Garfo();
        }

      
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

