package hierarchy;

public abstract class Appliances_for_health extends Appliances{
    private int Number_of_modes;
    public int getNumber_of_modes(){return Number_of_modes;}
    public void getDescription()
    {
        System.out.printf("\n\t Количество режимов: %s ",
                getNumber_of_modes());
        super.getDescription();
    }
    public Appliances_for_health(int number_of_modes, String manufacturer,String colour,
                                  double weight, String material)
    {
        super(manufacturer, colour, weight, material);
        Number_of_modes=number_of_modes;
    }
}
