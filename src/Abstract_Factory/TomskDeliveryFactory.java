package Abstract_Factory;

public class TomskDeliveryFactory implements DeliveryFactory{
    public Delivery createDelivery() {
        return new Pickup();
    }
}
