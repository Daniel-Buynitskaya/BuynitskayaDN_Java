package hierarchy;

import Abstract_Factory.Delivery;
import Abstract_Factory.DeliveryFactory;

public class Massager extends Massage_technique{
    private String Model;
    public String getModel(){return Model;}
    private String Appointment;
    public String getAppointment(){return Appointment;}
    private String Type;
    public String getType(){return Type;}
    private DeliveryFactory factory;
    public void getDescription()
    {
        System.out.printf("%s \n\t Назначение: %s \n\t Тип: %s ",
                getModel(),getAppointment(), getType());
        super.getDescription();
    }
    public void DeliveryDescription(){
        Delivery delivery = factory.createDelivery();
        System.out.printf("\n\t Тип доставки: %s \n\t Стоимость: %s руб.",
                delivery.getType(),delivery.getCost());
    }
    public Massager(String model, String appointment, String type,
                    String massage_type, boolean infrared_heating, int number_of_modes, String manufacturer,
                             String colour, double weight, String material, double cost, int guarantee)
    {
        super(massage_type, infrared_heating, number_of_modes, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Appointment=appointment;
        Type=type;
    }
    public Massager(DeliveryFactory factory, String model, String appointment, String type,
                    String massage_type, boolean infrared_heating, int number_of_modes, String manufacturer,
                    String colour, double weight, String material, double cost, int guarantee)
    {
        super(massage_type, infrared_heating, number_of_modes, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Appointment=appointment;
        Type=type;
        this.factory=factory;
    }
}
