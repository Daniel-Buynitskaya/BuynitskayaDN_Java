package Decorator;
import hierarchy.Appliances;

public abstract class Decorator extends Appliances {
    public abstract void getDescription();
    public Decorator(Appliances appliances)
    {
        super(appliances.getManufacturer(), appliances.getColour(), appliances.getWeight(), appliances.getMaterial(),
                appliances.getCost(), appliances.getGuarantee());
    }
}
