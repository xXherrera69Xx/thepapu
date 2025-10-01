package src;




class Consumidor extends Thread {
    private final Buffer buffer;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) { // Debe consumir los mismos datos
            int valor = buffer.get();
            try {
                Thread.sleep(150); // Simula tiempo de consumo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
