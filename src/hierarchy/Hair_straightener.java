package hierarchy;

import Abstract_Factory.Delivery;
import Abstract_Factory.DeliveryFactory;

public class Hair_straightener extends Hair_styling_techniques{
    private String Model;
    public String getModel(){return Model;}
    private String Plate_coating;
    public String getPlate_coating(){return Plate_coating;}
    private boolean Floating_plates;
    public String getFloating_plates(){if (Floating_plates==true) return "есть"; else return "нет";}
    private double Plate_width;
    public double getPlate_width(){return Plate_width;}
    private DeliveryFactory factory;
    public void getDescription()
    {
        System.out.printf("%s \n\t Покрытие пластин: %s \n\t Плавующие пластины: %s \n\t Ширина пластин: %s мм",
                getModel(),getPlate_coating(), getFloating_plates(), getPlate_width());
        super.getDescription();
    }
    public void DeliveryDescription(){
        Delivery delivery = factory.createDelivery();
        System.out.printf("\n\t Тип доставки: %s \n\t Стоимость: %s руб.",
                delivery.getType(),delivery.getCost());
    }
    public Hair_straightener(String model, String plate_coating, boolean floating_plates, double plate_width,
                      String ionization, int number_of_modes, String manufacturer,String colour,
                      double weight, String material, double cost, int guarantee)
    {
        super(ionization, number_of_modes, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Plate_coating=plate_coating;
        Floating_plates=floating_plates;
        Plate_width=plate_width;
    }
    public Hair_straightener(DeliveryFactory factory, String model, String plate_coating, boolean floating_plates, double plate_width,
                             String ionization, int number_of_modes, String manufacturer,String colour,
                             double weight, String material, double cost, int guarantee)
    {
        super(ionization, number_of_modes, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Plate_coating=plate_coating;
        Floating_plates=floating_plates;
        Plate_width=plate_width;
        this.factory=factory;
    }
}
