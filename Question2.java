public class Question2 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> printEven());
       // t.run();
        Thread t2 = new Thread(()->  printOdd());
        t.start();
       // t2.start();
       // t.run();

        t2.run();
    }
    public static void printEven(){
        for(int i = 0; i <= 10; i= i+2)
        {

            System.out.println("Even : "+i);
        }
    }
    public static void printOdd(){
        for(int i = 1; i <= 9; i= i+2){
            System.out.println("Odd : "+i);

        }
    }
}