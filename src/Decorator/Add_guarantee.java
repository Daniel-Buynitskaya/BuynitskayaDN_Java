package Decorator;
import hierarchy.Appliances;

public class Add_guarantee extends Decorator{
    Appliances appliances;
    private int add_guarantee;
    public int getAdd_guarantee(){return add_guarantee;}
    private double this_cost;
    public double getThis_cost(){return this_cost;}
    public Add_guarantee (Appliances appliances, int add_guarantee, double cost){
        super(appliances);
        this.appliances=appliances;
        this.add_guarantee=add_guarantee;
        this_cost=cost;
    }
    public double getCost(){return appliances.getCost()+getThis_cost();}
    public int getGuarantee(){return appliances.getGuarantee()+getAdd_guarantee();}
    public void getDescription() {
        appliances.getDescription();
        System.out.printf("\n Гарантия увеличена на %s месяцев - в итоге %s месяцев." +
                "\n Стоимость дополнительной гарантии: %s руб. Итоговая стоимость: %s руб.",
                getAdd_guarantee(), getGuarantee(), getThis_cost(), getCost());
    }

    public void DeliveryDescription() {
    }
}
