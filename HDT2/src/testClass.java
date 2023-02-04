import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testClass {
	
	
	@Test
	public void popReturnsDeletedItemAtTheTopOfStack() {
		Stack<Object> testStack = new Stack<Object>();
		testStack.push(3.0f);
		testStack.push(4.0f);
		testStack.push(2.0f);
		testStack.push(1.0f);
		
		assertEquals( 1.0f,  testStack.pop());
	}
	
	
	@Test
	public void popDeletesItemAtTheTopOfStack() {
		Stack<Object> testStack = new Stack<Object>();
		testStack.push(3.0f);
		testStack.push(4.0f);
		testStack.push(2.0f);
		testStack.push(1.0f);
		testStack.pop();
		
		assertEquals( 2.0f, testStack.Peek());
	}
	
	@Test
	public void pushCanBeMadeWithDifferentDataTypeInt() {
		Stack<Object> testStack = new Stack<Object>();
		testStack.push(3);
		testStack.push(4);
		testStack.push(9);
		testStack.push(0);
		testStack.pop();
		
		assertEquals( 9, testStack.Peek());
	}
	
	@Test
	public void PushAddsNewItemToTheTheTopOfStack() {
		Stack<Object> testStack = new Stack<Object>();
		testStack.push(3.32);
		testStack.pop();
		testStack.push(4.00);
		testStack.push(9.23);
		testStack.pop();
		testStack.pop();
		testStack.push(0.24);
		testStack.push(9.21);
		testStack.push(9.91);
		
		assertEquals( 9.91, testStack.Peek());
	}
	
	@Test
	public void ResultaOfAditionIs15f() {
		Stack<Object> testStack = new Stack<Object>();
		StackManager OperationTester = new StackManager();
		
		testStack.push(3.0f);
		testStack.push(4.0f);
		testStack.push(9.0f);
		testStack.push(6.0f);
		float val1 = (float) testStack.pop();
		float val2 = (float) testStack.pop();
		
		assertEquals( 15.0f , OperationTester.Add(val1, val2) , 0D);
	}
	
	@Test
	public void ResultaOfSubstractionIs20f() {
		Stack<Object> testStack = new Stack<Object>();
		StackManager OperationTester = new StackManager();
		
		testStack.push(3.0f);
		testStack.push(21.0f);
		
		testStack.push(1.0f);
		float val2 = (float) testStack.pop();
		float val1 = (float) testStack.pop();
		
		assertEquals( 20.0f , OperationTester.Substraction(val1, val2) , 0D);
	}
	
	@Test
	public void ResultaOfSubstractionIs45f() {
		Stack<Object> testStack = new Stack<Object>();
		StackManager OperationTester = new StackManager();
		
		testStack.push(2.20f);
		float result = OperationTester.Add(5.00f , 10.00f);
		testStack.push(result);
		
		testStack.push(3.0f);
		float val2 = (float) testStack.pop();
		float val1 = (float) testStack.pop();
		
		assertEquals( 45.0f , OperationTester.Multiply(val1, val2) , 0D);
	}
	
	@Test
	public void ResultaOfDivitionIs2f() {
		Stack<Object> testStack = new Stack<Object>();
		StackManager OperationTester = new StackManager();
		
		testStack.push(2.20f);
		testStack.push(250.0f);
		
		testStack.push(125.0f);
		float val2 = (float) testStack.pop();
		float val1 = (float) testStack.pop();
		
		assertEquals( 2.0f , OperationTester.Divition(val1, val2) , 0D);
	}
	
}
