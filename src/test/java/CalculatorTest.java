import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void  init(){
        calculator = new Calculator();
    }
    @Test
    public void IsEmptyNumber() throws  Exception{
        Calculator calculator = new Calculator();
        assertEquals(calculator.Add(""),0);
    }
    @Test
    public  void SingleDigit() throws Exception{
        Calculator calculator = new Calculator();
        assertEquals(calculator.Add("1"),1);
    }
@Test
    public void TwoDigits() throws  Exception{
    assertEquals(calculator.Add("1,1"),2);
}
@Test
    public void NewLineNumbers() throws Exception{
    assertEquals(calculator.Add("1\n1"),2);
}
@Test
    public void ThreeNumbersDelimiters() throws  Exception{
    assertEquals(calculator.Add("1\n1"),2);
}
@Test
    public void IgnoreNumbers() throws Exception{
    assertEquals(calculator.Add("1,2,1001"),3);
}
@Test
    public final void DifferentDelimiters() throws  Exception{
    assertEquals("2,2,3", calculator.Add("//;n2;2;3"));

}
}