
class Primes extends Thread

        {

        int threadie;

static   int a = 0;

static   int b = 0;

public Primes(int threadID)
        {

        threadie = threadID;

        }

public void run()

        {

        int n = 20;

        int c = 2 * n / 3;

        for (int i = 0; i < n; i++)

        {

        if(threadie == 1){

        if (i < c)

        {

        if ((Primes.isPrime(i))) { a++;  }

        }

        }

        if(threadie == 2){

        if (i >= c )

        {

        if ((Primes.isPrime(i))) { b++; }

        }}

        }
        if(threadie == 1)  System.out.println("Thread " + threadie + " contains " + a + " prime numbers ");

        if(threadie == 2)  System.out.println("Thread " + threadie + " contains " + b + " prime numbers ");

        }

static boolean isPrime(long n)

{

    if (n <= 1) return false;

    double limit = Math.sqrt(n);

    for (long i = 2; i <= limit; i++)

    {

        if (n % i == 0) return false;

    }

    return true;
}

public static void main(String[] arg)

        {



        Thread th1 = new Primes(1);

        Thread th2 = new Primes(2);

        th1.start();

        th2.start();

        try { th1.join(); }

        catch (InterruptedException ie) { }

        try { th2.join(); }

        catch (InterruptedException ie) { }



        System.out.println("\nThreads 1 and 2 have finished");

        int NumPrimes = a + b;

        System.out.println(" Number of primes is: " + NumPrimes);

        }

        }