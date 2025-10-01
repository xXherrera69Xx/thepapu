package src;

class Buffer {
    private int dato;
    private boolean disponible = false; // Si hay un dato listo para consumir

    // Método para que el productor ponga un dato
    public synchronized void put(int valor) {
        while (disponible) { // Mientras haya un dato, esperar
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.dato = valor;
        disponible = true;
        System.out.println("Productor puso: " + dato);
        notifyAll(); // Despertar a los consumidores
    }

    // Método para que el consumidor obtenga un dato
    public synchronized int get() {
        while (!disponible) { // Mientras no haya dato, esperar
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        disponible = false;
        System.out.println("Consumidor obtuvo: " + dato);
        notifyAll(); // Despertar a los productores
        return dato;
    }
}
