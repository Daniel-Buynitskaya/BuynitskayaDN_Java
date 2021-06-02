package Abstract_Factory;

public class Express_delivery extends Delivery{
    public String getType(){
        return "Курьерская доставка";
    }
    public double getCost(){
        return 300;
    }
}
