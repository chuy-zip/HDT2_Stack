
public class StackManager implements ICalculator{
	
	public StackManager(){
		
	}

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
		// TODO Auto-generated method stub
		return number1/number2;
	}

	@Override
	public float getNextInput() {
		// TODO Auto-generated method stub
		return 0;
	}

}
