package src;


	 //implementar Runnable
	class MiTarea implements Runnable {
	    @Override
	    public void run() {
	        System.out.println("hola aca ando en un runable");
	    }
	}

	// Clase principal
	public class Ejercicio2 {
	    public static void main(String[] args) {
	        // Crear instancia
	        MiTarea tarea = new MiTarea();

	        // Crear un hilo usando la instancia
	        Thread hilo = new Thread(tarea);

	        // Iniciar el hilo
	        hilo.start();   // Crea un nuevo hilo y ejecuta el run
	    }
	}


//pregunta pensativa: principal ventaja es poder heredar mas clases en vez de 1