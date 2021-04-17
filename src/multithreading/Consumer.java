package multithreading;

public class Consumer implements Runnable{
    Warehouse warehouse;
    private boolean isActive;
    void disable(){
        isActive=false;
    }
    Consumer (Warehouse warehouse){
        this.warehouse=warehouse;
        isActive = true;
    }
    public void run(){
        while (isActive) {
            warehouse.delete();
        }
    }
}
