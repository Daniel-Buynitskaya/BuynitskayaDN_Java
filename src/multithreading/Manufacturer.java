package multithreading;

public class Manufacturer implements Runnable{
    Warehouse warehouse;
    private boolean isActive;
    void disable(){
        isActive=false;
    }
    Manufacturer(Warehouse warehouse){
        this.warehouse=warehouse;
        isActive = true;
    }
    public void run(){
        while (isActive) {
            warehouse.add();
        }
    }
}
