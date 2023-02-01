import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		int Option = 0;
		
		System.out.println("Desea leer el archivo para realizar la operacion? Presione 1 para si o cualquier otra cosa para salir");
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
			System.out.println(StackData);	
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/**
		 * Storing the data from the file into a List
		 */
		
		
		Stack myStack = new Stack<Object>(StackData);
		StackManager Operation = new StackManager();
		
		String[] strSplit = StackData.split(" "); 
		System.out.println("...................................");
		
		for (int i = 0; i < strSplit.length; i++) {
			System.out.println(strSplit[i]);
			
		}
		
		System.out.println(myStack.Peek());
		
	}
		
}
