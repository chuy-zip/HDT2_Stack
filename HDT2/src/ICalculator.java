
public interface ICalculator {
	
	/**
	 * Adds two subsequent numbers from the stack
	 * @param number1 first number for the sum of numbers
	 * @param number2 second number for the sum of numbers
	 * @return
	 */
	float Add(float number1, float number2);
	
	/**
	 * Subtracts two subsequent numbers from the stack
	 * @param number1 first number for the substraction of numbers
	 * @param number2 second number for the substraction of numbers
	 * @return
	 */
	float Substraction(float number1, float number2);
	
	/**
	 * Multiplies two subsequent numbers from the stack
	 * @param number1 first number for the multiplication of numbers
	 * @param number2 second number for the multiplication of numbers
	 * @return
	 */
	float Multiply(float number1, float number2);
	
	/**
	 * Divides two subsequent numbers from the stack
	 * @param number1 first number for the divition of numbers
	 * @param number2 second number for the divition of numbers
	 * @return
	 */
	float Divition(float number1, float number2);
	
	/**
	 * It gets the value that is going currently going to be next in the stack.
	 * @return a value
	 */
	float getNextInput();
}
