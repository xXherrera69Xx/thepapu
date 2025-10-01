package src;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	                Scanner sc = new Scanner(System.in);

	                System.out.print("Ingrese el primer número: ");
	                double num1 = sc.nextDouble();

	                System.out.print("Ingrese el segundo número: ");
	                double num2 = sc.nextDouble();

	                System.out.println("Seleccione operación: + - * /");
	                char op = sc.next().charAt(0);

	                double resultado = 0;

	                switch (op) {
	                    case '+': resultado = num1 + num2; break;
	                    case '-': resultado = num1 - num2; break;
	                    case '*': resultado = num1 * num2; break;
	                    case '/': 
	                        if (num2 != 0) {
	                            resultado = num1 / num2;
	                        } else {
	                            System.out.println("Error: división por cero");
	                            return;
	                        }
	                        break;
	                    default: 
	                        System.out.println("Operación no válida");
	                        return;
	                }

	                System.out.println("Resultado: " + resultado);
	            }
	        
		   }
	

	



