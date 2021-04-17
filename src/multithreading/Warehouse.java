package multithreading;

public class Warehouse {
    private int capacity;
    public Warehouse(int capacity){
        this.capacity=capacity;
    }

    private int product=0;

    public synchronized void add() {
        while (product>=capacity) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Произведен товар. Товаров на складе: "+product);
        notify();
    }
    public synchronized void delete() {
        while (product<1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("Потреблен товар. Товаров на складе: "+product);
        notify();
    }
}
