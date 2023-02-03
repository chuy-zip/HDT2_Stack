import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class testClass {
	
	
	@Test
	public void popReturnsDeletedItemAtTheTopOfStack() {
		Stack<Object> testStack = new Stack<Object>();
		testStack.push(3.0f);
		testStack.push(4);
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
}
