public class Fisolofo {
    private Garfo garfoEsquerdo;
    private Garfo garfoDireito;

    public Fisolofo(Garfo garfoEsquerdo, Garfo garfoDireito) {
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
    }

    public Garfo getGarfoEsquerdo() {
        return garfoEsquerdo;
    }

    public Garfo getGarfoDireito() {
        return garfoDireito;
    }
}
