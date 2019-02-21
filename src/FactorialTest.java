import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void factorial() throws FactorialException{

            Factorial f1 = new Factorial(2, 6);
            assertEquals(720, Factorial.result);
           Factorial f2 = new Factorial(1, 0);
            assertEquals(1, Factorial.result);
            Factorial f3 = new Factorial(1, 1);
            assertEquals(1, Factorial.result);
            Factorial f4 = new Factorial(2, 3);
            assertEquals(6, Factorial.result);
            Factorial f5 = new Factorial(5, 10);
            assertEquals(3628800, Factorial.result);
            Factorial f6 = new Factorial(6, 6);
            assertEquals(720, Factorial.result);
            Factorial f7 = new Factorial(5, 3);
            assertEquals(6, Factorial.result);
            Factorial f8 = new Factorial(0, 25);
            assertEquals(7.0345352775739638e+18, Factorial.result);
            Factorial f9 = new Factorial(2, 25);
            assertEquals(7.0345352775739638e+18, Factorial.result);



    }
}