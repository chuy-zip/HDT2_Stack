import java.util.ArrayList;

public class Stack<T> implements IStack<T>{

	private int StackSize;
	private ArrayList<Float> StackOperands; 
	
	public Stack(){
		StackOperands = new ArrayList<Float>();	
	}

	@Override
	public T pop() {
		T EliminatedValue = null;
		try {
			EliminatedValue = (T) StackOperands.get(StackOperands.size() - 1);
			StackOperands.remove(StackOperands.size() - 1);
		} catch (Exception e) {
			System.out.println("Error, no se encontraron suficientes operandos para las operacioens pendientes");
			System.out.println("Se terminaran las operaciones");
			System.exit(0);
		}
		
		
		return EliminatedValue;
	}

	@Override
	public void push(T item) {
		String currentStack = "";
		StackOperands.add((Float) item);
		for (Float floats : StackOperands) {
			currentStack += floats + ", ";  
		}
		
		System.out.println("Estado actual: " + currentStack + "\n");
		
	}

	@Override
	public T Peek() {
		return (T) StackOperands.get(StackOperands.size() - 1);
	}

	@Override
	public int Size() {
		return StackOperands.size();
	}


}
