package Decorator;
import hierarchy.Appliances;

public class Sale extends Decorator{
    Appliances appliances;
    private int sale;
    public int getSale(){return sale;}
    public Sale (Appliances appliances, int sale){
        super(appliances);
        this.appliances=appliances;
        this.sale=sale;
    }
    public double getCost(){return (1-(double)getSale()/100)*appliances.getCost();}
    public void getDescription() {
        appliances.getDescription();
        System.out.printf("\n Стоимость со скидкой: %.2f руб. Скидка составила %s", getCost(), getSale()+"%");
    }
}
