/**
 * Universidad del Valle de Guatemala
 * Hoja de trabajo 2. Algoritmos y Estructuras de datos 
 * Ricardo Chuy 221007
 * The objective of this program is to simulate a postfix calculator with a stack.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int Option = 0;
		
		System.out.println("Desea leer el archivo para realizar la operacion? \nPresione 1 para si o cualquier otra cosa para salir");
		Option = Scan.nextInt();
		
		if(Option != 1) {
			System.out.println("Feliz dia");
			System.exit(0);
		}
		
		String MyFile = "src/datos.txt";
		String StackData = "";
		
		/**
		 * Reading file datos.txt
		 */
		try {
			BufferedReader reader = new BufferedReader(new FileReader(MyFile));
			StackData = reader.readLine();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * Storing the data from the file into an ArrayList and creating the calculator and stack object
		 */
		String[] strSplit = StackData.split(" ");
		
		Stack<Object> myStack = new Stack<Object>();
		StackManager Operation = new StackManager();
		
		 
		System.out.println("...................................");
		
		/**
		 * This loop is to iterate through all the elements that were present in the txt file
		 */
		for (int i = 0; i < strSplit.length; i++) {

			System.out.println("Entrada: " + strSplit[i]);
			
			/**
			 * Addition case
			 */
			if(strSplit[i].equals("+")) {
				System.out.println("Operacion: Sumar, pop, pop y push del resultado");
				float SecondOperand = (float) myStack.pop();
				float FirstOperand = (float) myStack.pop();
				float result = Operation.Add(FirstOperand, SecondOperand);
				myStack.push(result);
				
			}
			
			/**
			 * Substraction case
			 */
			else if(strSplit[i].equals("-")) {
				System.out.println("Operacion: Restar, pop, pop y push del resultado");
				float SecondOperand = (float) myStack.pop();
				float FirstOperand = (float) myStack.pop();
				float result = Operation.Substraction(FirstOperand, SecondOperand);
				myStack.push(result);
			
			}
			
			/**
			 * Multiplication case
			 */
			else if(strSplit[i].equals("*")) {
				System.out.println("Operacion: Multiplicar, pop, pop y push del resultado");
				float SecondOperand = (float) myStack.pop();
				float FirstOperand = (float) myStack.pop();
				float result = Operation.Multiply(FirstOperand, SecondOperand);
				myStack.push(result);
			}
			
			/**
			 * Division operand
			 */
			else if(strSplit[i].equals("/")) {
				System.out.println("Operacion: Dividir, pop, pop y push del resultado");
				float SecondOperand = (float) myStack.pop();
				float FirstOperand = (float) myStack.pop();
				float result = Operation.Divition(FirstOperand, SecondOperand);
				myStack.push(result);
			}
			
			/**
			 * Case for an invalid character, this will not be added to the stack
			 */
			else {
				try {
			        float pushedValue = Float.parseFloat(strSplit[i]);
			        System.out.println("Push al operando: " + strSplit[i]);
			        myStack.push(pushedValue);
					
			    } catch(NumberFormatException e) {
			    	System.out.println(strSplit[i] + ", no es un caracter valido para operando o signo de operacion\n");
			    }
			}
		}
		
	}
		
}
