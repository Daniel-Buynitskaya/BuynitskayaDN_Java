package hierarchy;

public abstract class Appliances_for_drinks extends Appliances_for_kitchen {
    private boolean Maintaining_temperature;
    public String getMaintaining_temperature(){if (Maintaining_temperature==true) return "есть"; else return "нет";}
    private boolean Automatic_shutdown;
    public String getAutomatic_shutdown(){if (Automatic_shutdown==true) return "есть"; else return "нет";}
    public void getDescription()
    {
        System.out.printf("\n\t Поддержание температуры: %s \n\t Автоматическое отключение: %s ",
                getMaintaining_temperature(),getAutomatic_shutdown());
        super.getDescription();
    }
    public Appliances_for_drinks(boolean maintaining_temperature, boolean automatic_shutdown,
                                 boolean timer_display, String manufacturer,String colour,
                                  double weight, String material, double cost, int guarantee)
    {
        super(timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Maintaining_temperature=maintaining_temperature;
        Automatic_shutdown=automatic_shutdown;
    }
}
