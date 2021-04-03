package hierarchy;

public class Hair_straightener extends Hair_styling_techniques{
    private String Model;
    public String getModel(){return Model;}
    private String Plate_coating;
    public String getPlate_coating(){return Plate_coating;}
    private boolean Floating_plates;
    public String getFloating_plates(){if (Floating_plates==true) return "есть"; else return "нет";}
    private double Plate_width;
    public double getPlate_width(){return Plate_width;}
    public void getDescription()
    {
        System.out.printf("%s \n\t Покрытие пластин: %s \n\t Плавующие пластины: %s \n\t Ширина пластин: %s мм",
                getModel(),getPlate_coating(), getFloating_plates(), getPlate_width());
        super.getDescription();
    }
    public Hair_straightener(String model, String plate_coating, boolean floating_plates, double plate_width,
                      String ionization, int number_of_modes, String manufacturer,String colour,
                      double weight, String material)
    {
        super(ionization, number_of_modes, manufacturer, colour, weight, material);
        Model=model;
        Plate_coating=plate_coating;
        Floating_plates=floating_plates;
        Plate_width=plate_width;
    }
}
