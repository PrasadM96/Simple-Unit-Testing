import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SampleTest{

	@Test 
	public void stringComaparison(){
		String actual = "Hello World";
		assertEquals("Hello World",actual);
	}
}