public class Fisolofo extends Thread {
    private final int id;
    private final Garfo garfoEsquerdo;
    private final Garfo garfoDireito;
    private final int tempoPensar;
    private final int tempoComer;

    public Fisolofo(int id, Garfo garfoEsquerdo, Garfo garfoDireito, int tempoPensar, int tempoComer) {
        this.id = id;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
        this.tempoPensar = tempoPensar;
        this.tempoComer = tempoComer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                pensar();
                comer();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void pensar() throws InterruptedException {
        System.out.println("Filósofo " + id + " está pensando.");
        Thread.sleep(tempoPensar);
    }

    private void comer() throws InterruptedException {
        if (id % 2 == 0) {
            synchronized (garfoEsquerdo) {
                synchronized (garfoDireito) {
                    System.out.println("Filósofo " + id + " está comendo.");
                    Thread.sleep(tempoComer);
                }
            }
        } else {
            synchronized (garfoDireito) {
                synchronized (garfoEsquerdo) {
                    System.out.println("Filósofo " + id + " está comendo.");
                    Thread.sleep(tempoComer);
                }
            }
        }
    }

    public Garfo getGarfoEsquerdo() {
        return garfoEsquerdo;
    }

    public Garfo getGarfoDireito() {
        return garfoDireito;
    }

    public int getIdFilosofo() {
        return id;
    }
}
