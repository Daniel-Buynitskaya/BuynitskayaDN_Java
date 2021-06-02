package hierarchy;

import Abstract_Factory.Delivery;
import Abstract_Factory.DeliveryFactory;

public class Hair_dryer extends Hair_styling_techniques{
    private String Model;
    public String getModel(){return Model;}
    private boolean Cold_air_supply;
    public String getCold_air_supply(){if (Cold_air_supply==true) return "есть"; else return "нет";}
    private boolean Diffuser_nozzle;
    public String getDiffuser_nozzle(){if (Diffuser_nozzle==true) return "есть"; else return "нет";}
    private DeliveryFactory factory;
    public void getDescription()
    {
        System.out.printf("%s \n\t Подача холодного воздуха: %s \n\t Насадка-диффузор: %s ",
                getModel(),getCold_air_supply(), getDiffuser_nozzle());
        super.getDescription();
    }
    public void DeliveryDescription(){
        Delivery delivery = factory.createDelivery();
        System.out.printf("\n\t Тип доставки: %s \n\t Стоимость: %s руб.",
                delivery.getType(),delivery.getCost());
    }
    public Hair_dryer(String model, boolean cold_air_supply, boolean diffuser_nozzle,
                      String ionization, int number_of_modes, String manufacturer,String colour,
                                   double weight, String material, double cost, int guarantee)
    {
        super(ionization, number_of_modes, manufacturer, colour, weight, material, cost,guarantee);
        Model=model;
        Cold_air_supply=cold_air_supply;
        Diffuser_nozzle=diffuser_nozzle;
    }
    public Hair_dryer(DeliveryFactory factory, String model, boolean cold_air_supply, boolean diffuser_nozzle,
                      String ionization, int number_of_modes, String manufacturer,String colour,
                      double weight, String material, double cost, int guarantee)
    {
        super(ionization, number_of_modes, manufacturer, colour, weight, material, cost,guarantee);
        Model=model;
        Cold_air_supply=cold_air_supply;
        Diffuser_nozzle=diffuser_nozzle;
        this.factory=factory;
    }
}
