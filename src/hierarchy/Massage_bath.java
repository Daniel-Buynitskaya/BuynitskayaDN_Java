package hierarchy;

public class Massage_bath extends Massage_technique{
    private String Model;
    public String getModel(){return Model;}
    private boolean Adding_oils_and_salts;
    public String getAdding_oils_and_salts(){if (Adding_oils_and_salts==true) return "есть"; else return "нет";}
    private boolean Use_without_water;
    public String getUse_without_water(){if (Use_without_water==true) return "есть"; else return "нет";}
    public void getDescription()
    {
        System.out.printf("%s \n\t Возможность добавления масел и солей: %s \n\t Возможность использования без воды: %s ",
                getModel(),getAdding_oils_and_salts(), getUse_without_water());
        super.getDescription();
    }
    public Massage_bath(String model, boolean adding_oils_and_salts, boolean use_without_water,
                    String massage_type, boolean infrared_heating, int number_of_modes, String manufacturer,
                    String colour, double weight, String material)
    {
        super(massage_type, infrared_heating, number_of_modes, manufacturer, colour, weight, material);
        Model=model;
        Adding_oils_and_salts=adding_oils_and_salts;
        Use_without_water=use_without_water;
    }
}
