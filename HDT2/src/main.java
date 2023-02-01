import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		String Option = "0";
		
		System.out.println("Desea leer el archivo para realizar la operacion? Presione 1 para si o cualquier otra cosa para salir");
		Option = Scan.nextLine();
		
		if(Option.equals("1")) {
			System.out.println("a");
			
			String MyFile = "src/datos.txt";
			String StackData = "";
			
			/**
			 * Reading file datos.txt and storing it on a List
			 */
			try {
				BufferedReader reader = new BufferedReader(new FileReader(MyFile));
				StackData = reader.readLine();
				System.out.println(StackData);	
		
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			String[] strSplit = StackData.split(" "); 
			System.out.println("...................................");
			
			for (int i = 0; i < strSplit.length; i++) {
				System.out.println(strSplit[i] + i);
			}
			
		}
		
		else {
			System.out.println("Feliz dia");
		}
		
	}
}
