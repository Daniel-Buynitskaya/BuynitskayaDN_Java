package hierarchy;

public abstract class Appliances_for_kitchen extends Appliances {
    private boolean Timer_display;
    public String getTimer_display(){if (Timer_display==true) return "есть"; else return "нет";}
    public void getDescription()
    {
        System.out.printf("\n\t Наличие таймера/дисплея: %s ",
                getTimer_display());
        super.getDescription();
    }
    public Appliances_for_kitchen(boolean timer_display, String manufacturer,String colour,
                                  double weight, String material)
    {
        super(manufacturer, colour, weight, material);
        Timer_display=timer_display;
    }
}
