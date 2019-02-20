public class ThreadSample extends Thread {
    public int threadNumber; //indices of the threads
    public String name;      //name of the thread

    public ThreadSample(int num,String name){
        threadNumber = num;
        this.name=name;
    }

    public void run(){
        long subResult=0;
       try {
           if (threadNumber == 1) { //work division for first thread

               subResult=Factorial.factorial(1, (Factorial.n / Factorial.threadNumber));
               System.out.println("My name is "+name+", My subresult is: "+subResult);
               Factorial.EvaluateResult(subResult);

           }
           else{ //work division for subsequent threads

               subResult=Factorial.factorial((((((threadNumber-1)*Factorial.n))/Factorial.threadNumber)+1),
                                            (threadNumber*Factorial.n)/Factorial.threadNumber);

               System.out.println("My name is "+name+", My subresult is: "+subResult);

               Factorial.EvaluateResult(subResult); //result of the factorial computed by the thread reflected in
                                                    //the main result by calling the method Evaluateresult
           }
       }catch (FactorialException e){e.getMessage();}
    }
}
