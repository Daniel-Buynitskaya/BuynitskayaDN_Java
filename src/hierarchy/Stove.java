package hierarchy;

public class Stove extends Appliances_for_cooking{
    private String Model;
    public String getModel(){return Model;}
    private String Type;
    public String getType(){return Type;}
    private boolean Oven_convection;
    public String getOven_convection(){if (Oven_convection==true) return "есть"; else return "нет";}
    private int Number_of_burners;
    public int getNumber_of_burners(){return Number_of_burners;}
    public void getDescription()
    {
        System.out.printf("%s \n\t Тип: %s \n\t Конвекция в духовке: %s \n\t Число конфорок: %s ",
                getModel(),getType(), getOven_convection(), getNumber_of_burners());
        super.getDescription();
    }
    public Stove(String model, String type, boolean oven_convection, int number_of_burners, String control_type,
                 boolean timer_display, String manufacturer,String colour,
                                  double weight, String material, double cost, int guarantee)
    {
        super(control_type, timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Type=type;
        Oven_convection=oven_convection;
        Number_of_burners=number_of_burners;
    }
}
