package Abstract_Factory;

public class OmskDeliveryFactory implements DeliveryFactory{
    public Delivery createDelivery() {
        return new Express_delivery();
    }
}
