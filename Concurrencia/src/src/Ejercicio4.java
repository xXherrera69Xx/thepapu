package src;

class Contador {
 private int valor = 0;

 // Hacemos el método sincronizado para proteger la seccion
 public synchronized void incrementar() {
     valor++;
 }

 public int getValor() {
     return valor;
 }
}

class Incrementador implements Runnable {
 private final Contador contador;
 private final int veces;

 public Incrementador(Contador contador, int veces) {
     this.contador = contador;
     this.veces = veces;
 }

 @Override
 public void run() {
     for (int i = 0; i < veces; i++) {
         contador.incrementar();
     }
 }
}

public class Ejercicio4 {
 public static void main(String[] args) throws InterruptedException {
     Contador contador = new Contador();
     int nHilos = 5;
     int nVeces = 1000;

     Thread[] hilos = new Thread[nHilos];
     for (int i = 0; i < nHilos; i++) {
         hilos[i] = new Thread(new Incrementador(contador, nVeces), "Inc-" + i);
         hilos[i].start();
     }

     for (Thread t : hilos) {
         t.join();
     }

     System.out.println("Valor: " + contador.getValor());

 }
}

