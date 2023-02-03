
public class StackManager implements ICalculator{
	
	@Override
	public float Add(float number1, float number2) {
		
		return number1 + number2;
	}

	@Override
	public float Substraction(float number1, float number2) {
		
		return number1 - number2;
	}

	@Override
	public float Multiply(float number1, float number2) {
		
		return number1 * number2;
	}

	@Override
	public float Divition(float number1, float number2) {
		if(number2 == 0) {
			System.out.println("Error matematico, la division entre 0 no existe. Se terminaran las operaciones");
			System.exit(0);
		}
		
		return number1/number2;
	}

	@Override
	public float getNextInput() {
		// TODO Auto-generated method stub
		return 0;
	}

}
