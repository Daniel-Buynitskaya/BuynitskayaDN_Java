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
    private double Cost;
    public double getCost() {return Cost;}
    private int Guarantee;
    public int getGuarantee(){return Guarantee;}

    public void getDescription()
    {
        System.out.printf("\n\t Производитель: %s \n\t Основной цвет: %s \n\t Основной материал: %s \n\t Вес: %s кг \n\n Стоимость: %.2f руб.   Гарантия %s месяцев",
                getManufacturer(),getColour(), getMaterial(), getWeight(), getCost(), getGuarantee());
    }
    public abstract void DeliveryDescription();
    public Appliances(String manufacturer,String colour, double weight, String material, double cost, int guarantee)
    {
        Manufacturer=manufacturer;
        Colour=colour;
        Weight=weight;
        Material=material;
        Cost=cost;
        Guarantee=guarantee;
    }
}
