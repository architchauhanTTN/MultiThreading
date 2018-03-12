import com.sun.org.apache.xpath.internal.SourceTree;

public class question3 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 =new Thread(() ->
        {
            System.out.println("1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 =new Thread(()->
        {
            System.out.println("2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        Thread t3 = new Thread(()->
        {
            System.out.println("3");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t3.start();

        System.out.println(t1.isAlive());

        t1.join();
        t2.join();
        t3.join();

        System.out.println("end of all tasks....");

    }
}
