package Abstract_Factory;

public class Pickup extends Delivery{
    public String getType(){
        return "Самовывоз";
    }
    public double getCost(){
        return 0;
    }
}
