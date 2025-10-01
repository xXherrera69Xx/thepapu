package src;

class Productor extends Thread {
    private final Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Ejemplo: 5 datos
            buffer.put(i);
            try {
                Thread.sleep(100); // Simula tiempo de producción
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

