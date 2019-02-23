import org.junit.jupiter.api.Assertions;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial() throws FactorialException{

        Factorial f2 = new Factorial(0, 0);
        assertEquals( BigInteger.valueOf(1), Factorial.result);
        Factorial f3 = new Factorial(1, 1);
        assertEquals(new BigInteger("1"), Factorial.result);
        Factorial f11 = new Factorial(0, 10);
        assertEquals(new BigInteger("3628800"), Factorial.result);
        Factorial f5 = new Factorial(2, 10);
        assertEquals(new BigInteger("3628800"), Factorial.result);
        Factorial f12 = new Factorial(0, 6);
        assertEquals(new BigInteger("720"), Factorial.result);
        Factorial f6 = new Factorial(4, 6);
        assertEquals(new BigInteger("720"), Factorial.result);
        Factorial f7 = new Factorial(5, 3);
        assertEquals(new BigInteger("6"), Factorial.result);
        Factorial f8 = new Factorial(0, 25);
        assertEquals(new BigInteger("15511210043330985984000000"), Factorial.result);
        Factorial f9 = new Factorial(4, 25);
        assertEquals(new BigInteger("15511210043330985984000000"), Factorial.result);
        Factorial f10 = new Factorial(10, 25);
        assertEquals(new BigInteger("15511210043330985984000000"), Factorial.result);




    }
}