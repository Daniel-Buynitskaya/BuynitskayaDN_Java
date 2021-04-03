package hierarchy;

public class Microwave extends Appliances_for_cooking{
    private String Model;
    public String getModel(){return Model;}
    private boolean Grill;
    public String getGrill(){if (Grill==true) return "есть"; else return "нет";}
    private boolean Automatic_defrosting;
    public String getAutomatic_defrosting(){if (Automatic_defrosting=true) return "есть"; else return "нет";}
    public void getDescription()
    {
        System.out.printf("%s \n\t Гриль: %s \n\t Автоматическая разморозка: %s ",
                getModel(),getGrill(), getAutomatic_defrosting());
        super.getDescription();
    }
    public Microwave(String model, boolean grill, boolean automatic_defrosting, String control_type,
                 boolean timer_display, String manufacturer,String colour,
                 double weight, String material)
    {
        super(control_type, timer_display, manufacturer, colour, weight, material);
        Model=model;
        Grill=grill;
        Automatic_defrosting=automatic_defrosting;
    }
}
