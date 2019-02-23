import java.math.BigInteger;
public class ThreadSample extends Thread {
    public int threadNumber; //indices of the threads
    public String name;      //name of the thread
    public BigInteger subResult; //the result that thread returns

    public ThreadSample(int num,String name){
        threadNumber = num;
        this.name=name;
    }

    public void run(){

       try {
           if (threadNumber == 1) { //work division for first thread

               subResult=Factorial.factorial(1, (Factorial.n / Factorial.threadNumber));
              // System.out.println("My name is "+name+", My subresult is: "+subResult);


           }
           else{ //work division for subsequent threads

               subResult=Factorial.factorial((((((threadNumber-1)*Factorial.n))/Factorial.threadNumber)+1),
                                            (threadNumber*Factorial.n)/Factorial.threadNumber);

              // System.out.println("My name is "+name+", My subresult is: "+subResult);

           }
       }catch (FactorialException e){e.getMessage();}
    }
}
