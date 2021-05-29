package Factory;
import hierarchy.Appliances;

public class AppliancesStore {
    SimpleAppliancesFactory factory;
    public AppliancesStore(SimpleAppliancesFactory factory){
        this.factory=factory;
    }
    public Appliances thisAppliance(String type){
        Appliances appliances;
        appliances=factory.createAppliance(type);
        return appliances;
    }
}
