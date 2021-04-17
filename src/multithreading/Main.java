package multithreading;

public class Main {

    public static void main(String[] args) {
        int N=rnd (10,15);
        System.out.print("Вместимость склада: "+N+"\n");
        Warehouse warehouse=new Warehouse(N);
        Manufacturer manufacturer = new Manufacturer(warehouse);
        Consumer consumer = new Consumer(warehouse);
        new Thread(manufacturer).start();
        new Thread(consumer).start();
        try{
            Thread.sleep(2);
            manufacturer.disable();
            consumer.disable();
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
