package hierarchy;

import Abstract_Factory.Delivery;
import Abstract_Factory.DeliveryFactory;

public class Microwave extends Appliances_for_cooking{
    private String Model;
    public String getModel(){return Model;}
    private boolean Grill;
    public String getGrill(){if (Grill==true) return "есть"; else return "нет";}
    private boolean Automatic_defrosting;
    public String getAutomatic_defrosting(){if (Automatic_defrosting=true) return "есть"; else return "нет";}
    private DeliveryFactory factory;
    public void getDescription()
    {
        System.out.printf("%s \n\t Гриль: %s \n\t Автоматическая разморозка: %s ",
                getModel(),getGrill(), getAutomatic_defrosting());
        super.getDescription();
    }
    public void DeliveryDescription(){
        Delivery delivery = factory.createDelivery();
        System.out.printf("\n\t Тип доставки: %s \n\t Стоимость: %s руб.",
                delivery.getType(),delivery.getCost());
    }
    public Microwave(String model, boolean grill, boolean automatic_defrosting, String control_type,
                 boolean timer_display, String manufacturer,String colour,
                 double weight, String material, double cost, int guarantee)
    {
        super(control_type, timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Grill=grill;
        Automatic_defrosting=automatic_defrosting;
    }
    public Microwave(DeliveryFactory factory, String model, boolean grill, boolean automatic_defrosting, String control_type,
                     boolean timer_display, String manufacturer,String colour,
                     double weight, String material, double cost, int guarantee)
    {
        super(control_type, timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Grill=grill;
        Automatic_defrosting=automatic_defrosting;
        this.factory=factory;
    }
}
