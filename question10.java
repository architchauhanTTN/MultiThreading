

public class question10 {
    public static void main(String[] args) throws InterruptedException {
      SharedCounter counter = new SharedCounter();

      Thread t1 =new Thread(new Runnable()
      {
           public void run()
           {
               for (int i = 0;i<1000;i++)
               {
                   counter.increment();
               }
           }
      });

        Thread t2 =new Thread(new Runnable()
        {
            public void run()
            {
                for (int i = 0;i<1000;i++)
                {
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final count is :"+counter.count);
    }
}

 class SharedCounter
{
    int count=0;

   public synchronized void  increment()
    {
    count++;
    }
}

