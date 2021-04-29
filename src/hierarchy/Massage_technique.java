package hierarchy;

public abstract class Massage_technique extends Appliances_for_health {
    private String Massage_type;
    public String getMassage_type(){return Massage_type;}
    private boolean Infrared_heating;
    public String getInfrared_heating(){if (Infrared_heating==true) return "есть"; else return "нет";}
    public void getDescription()
    {
        System.out.printf("\n\t Вид массажа: %s \n\t Инфракрасный подогрев: %s ",
                getMassage_type(),getInfrared_heating());
        super.getDescription();
    }
    public Massage_technique(String massage_type, boolean infrared_heating, int number_of_modes, String manufacturer,
                             String colour, double weight, String material, double cost, int guarantee)
    {
        super(number_of_modes, manufacturer, colour, weight, material, cost, guarantee);
        Massage_type=massage_type;
        Infrared_heating=infrared_heating;
    }
}
