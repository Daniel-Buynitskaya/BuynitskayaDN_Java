package hierarchy;

public abstract class Appliances {
    private String Manufacturer;
    public String getManufacturer(){return Manufacturer;}
    private String Colour;
    public String getColour(){return Colour;}
    private double Weight;
    public double getWeight(){return Weight;}
    private String Material;
    public String getMaterial(){return Material;}
    public void getDescription()
    {
        System.out.printf("\n\t Производитель: %s \n\t Основной цвет: %s \n\t Основной материал: %s \n\t Вес: %s кг",
                getManufacturer(),getColour(), getMaterial(), getWeight());
    }
    public Appliances(String manufacturer,String colour, double weight, String material)
    {
        Manufacturer=manufacturer;
        Colour=colour;
        Weight=weight;
        Material=material;
    }
}
