public class Factorial {
    public static long n;
    public static int threadNumber;
    public  static long result=1;
    /* n=n*(n-1)!
     * f(n)=n*f(n-1)
     * Based on assignment 5, if I created a thread for each subproblem (T1-> (n-1)!, T2->(n-2)!..Tn-1->1!) Each thread
     * would depend on the result returned by the next thread and they'd be idle until then which seems using threads
     * obsolete. If we want to speed things up with multiprocessing, the threads should be independent of each other.
     * I refactored my code to reflect that. I divided up the input to be handled by k threads. Each thread returns
     * a result independent of each other and then those results are combined.The division of work load between
     * k threads are like below:
     *
     * T1->(1,n/k)
     * T2->((n/k)+1,2n/k)
     * T3->((2n/k)+1,3n/k)
     * .
     * .
     * Ti->((((i-1)*n)/k)+1,(i*n)/k)
     */
    public Factorial(int tNumber, long input){
         if (tNumber<=input) { //when thread number is less than the input
             threadNumber = tNumber;
         }
         else {
            if (input!=0) { //if there are more threads than the input, only threads of input size will be created
                threadNumber = (int) input;
            }
            else{
                threadNumber=1; //if input is 0 to calculate 0!, only 1 thread will be created
            }
         }
             n = input;
             result = 1;
             startThread(); //create threads


    }

    /*Combine results returned by the threads*/

    public static synchronized void EvaluateResult(long r)
    {
         result=result*r;
    }

    /*Evaluate the factorial of numbers between numbers low and high
    * low and high numbers should be positive or exception will be thrown
    */

    public static long factorial(long low,long high) throws FactorialException{
        long result=1;
        if ((low>0)) {
            if (high>0) {
                for(long i=low;i<=high;i++){
                    result=result*i;
                }
                return result;
            }
            else{
                if (high==0){
                    return 1;
                }
                else{
                    throw new FactorialException("Number should be positive!!");
                }
            }
        }
        else if (low==0)
               return 1;
             else{
                throw new FactorialException("Number should be positive!!");
             }
    }

    /*Threads are created and work division is done according to the indices of threads as shown in the
    * command line at the beginning*/

    public static void startThread(){
       System.out.println(n+"! with "+threadNumber+" Threads!!");
       try {
           for (int i = 1; i <= Factorial.threadNumber; i++) {
               ThreadSample t = new ThreadSample(i, "Thread" + i);
               t.start();
               t.join();
           }
       }
       catch(Exception se){System.out.println(se.getMessage());}
       System.out.println("Total result:"+result); //This is our total result

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


    }
}
