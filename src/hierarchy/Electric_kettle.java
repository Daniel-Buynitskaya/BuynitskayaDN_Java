package hierarchy;

public class Electric_kettle extends Appliances_for_drinks{
    private String Model;
    public String getModel(){return Model;}
    private boolean Water_level_scale;
    public String getWater_level_scale(){if (Water_level_scale==true) return "есть"; else return "нет";}
    private int Water_heating_temperatures;
    public int getWater_heating_temperatures(){return Water_heating_temperatures;}
    public void getDescription()
    {
        System.out.printf("%s \n\t Шкала уровня воды: %s \n\t Температура нагрева воды: %s С",
                getModel(),getWater_level_scale(), getWater_heating_temperatures());
        super.getDescription();
    }
    public Electric_kettle(String model, boolean water_level_scale, int water_heating_temperatures,
                           boolean maintaining_temperature, boolean automatic_shutdown,
                                 boolean timer_display, String manufacturer,String colour,
                                 double weight, String material, double cost, int guarantee)
    {
        super(maintaining_temperature, automatic_shutdown, timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Model=model;
        Water_level_scale=water_level_scale;
        Water_heating_temperatures=water_heating_temperatures;
    }
}
