package hierarchy;

public abstract class Appliances_for_cooking extends Appliances_for_kitchen {
    private String Control_type;
    public String getControl_type(){return Control_type;}
    public void getDescription()
    {
        System.out.printf("\n\t Вид управления: %s ",
                getControl_type());
        super.getDescription();
    }
    public Appliances_for_cooking(String control_type, boolean timer_display, String manufacturer,String colour,
                                  double weight, String material, double cost, int guarantee)
    {
        super(timer_display, manufacturer, colour, weight, material, cost, guarantee);
        Control_type=control_type;
    }
}
