package src;


	import java.util.concurrent.*;

// implementa Callable
	class TareaSumadora implements Callable<Integer> { 
	    private int numero;

	    public TareaSumadora(int numero) {
	        this.numero = numero;
	    }

	    @Override
	    public Integer call() throws Exception {
	        int suma = 0;
	        for (int i = 0; i <= numero; i++) {
	            suma += i;
	            Thread.sleep(10); // Simula
	        }
	        System.out.println("Suma de " + numero + " calculada."); 
	        return suma;
	    }
	}


	public class Ejercicio6 {
	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        // Crear pool de 3 hilod
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        // Enviar tarea al executor
	        Future<Integer> futuro1 = executor.submit(new TareaSumadora(15));
	        Future<Integer> futuro2 = executor.submit(new TareaSumadora(30));
	        Future<Integer> futuro3 = executor.submit(new TareaSumadora(50));

	        //  resultados
	        System.out.println("Resultado 1: " + futuro1.get());
	        System.out.println("Resultado 2: " + futuro2.get());
	        System.out.println("Resultado 3: " + futuro3.get());

	        // Apagar 
	        executor.shutdown();
	    }
	}


