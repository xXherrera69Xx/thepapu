package src;


//Main.java
public class Ejercicio1 {
 public static void main(String[] args) {
     // Crear instancia de MiHilo
     MiHilo hilo = new MiHilo();

     // Iniciar el hilo
     hilo.start();  
 }
}

//Pregunta pa pensar: el codigo se  ejecuta como una llamada normal y no crea un hilo nuevo. si se usa hilo.start se crea un nuevo hilo