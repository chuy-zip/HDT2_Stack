import java.util.ArrayList;

public class Stack<T> implements IStack<T>{

	private int StackSize;
	private T opreand1;
	private T TopElement;
	private ArrayList<Float> StackOperands; 
	
	public Stack(String StackData){
		StackOperands = new ArrayList<Float>();	
	}

	@Override
	public T pop() {
		
		T EliminatedValue = (T) StackOperands.get(StackOperands.size() - 1);
		StackOperands.remove(StackOperands.size() - 1);
		
		return EliminatedValue;
	}

	@Override
	public void push(T item) {
		StackOperands.add((Float) item);
		
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
