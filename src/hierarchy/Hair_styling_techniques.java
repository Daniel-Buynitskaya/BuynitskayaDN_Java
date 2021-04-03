package hierarchy;

public abstract class Hair_styling_techniques extends Appliances_for_health {
    private String Ionization;
    public String getIonization(){return Ionization;}
    public void getDescription()
    {
        System.out.printf("\n\t Ионизация: %s ",
                getIonization());
        super.getDescription();
    }
    public Hair_styling_techniques(String ionization, int number_of_modes, String manufacturer,String colour,
                                 double weight, String material)
    {
        super(number_of_modes, manufacturer, colour, weight, material);
        Ionization=ionization;
    }
}
