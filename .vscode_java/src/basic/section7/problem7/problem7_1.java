package section7.problem7;

import section7.myclass7.MaxCounter;

public class problem7_1 
{
    public static void main(String[] args)
    {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);
    }    
}
