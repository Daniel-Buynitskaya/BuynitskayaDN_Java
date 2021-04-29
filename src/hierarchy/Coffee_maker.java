package hierarchy;

public class Coffee_maker extends Appliances_for_drinks{
    private String Model;
    public String getModel(){return Model;}
    private String Type;
    public String getType(){return Type;}
    private String Used_coffee;
    public String getUsed_coffee(){return Used_coffee;}
    public void getDescription()
    {
        System.out.printf("%s \n\t Тип: %s \n\t Используемый кофе: %s ",
                getModel(),getType(), getUsed_coffee());
        super.getDescription();
    }
    public Coffee_maker(String model, String type, String used_coffee,
                           boolean maintaining_temperature, boolean automatic_shutdown,
                           boolean timer_display, String manufacturer,String colour,
                           double weight, String material, double cost, int guarantee)
    {
        super(maintaining_temperature, automatic_shutdown, timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Type=type;
        Used_coffee=used_coffee;
    }
}
