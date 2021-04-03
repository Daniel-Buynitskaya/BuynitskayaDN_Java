package hierarchy;

public class Massager extends Massage_technique{
    private String Model;
    public String getModel(){return Model;}
    private String Appointment;
    public String getAppointment(){return Appointment;}
    private String Type;
    public String getType(){return Type;}
    public void getDescription()
    {
        System.out.printf("%s \n\t Назначение: %s \n\t Тип: %s ",
                getModel(),getAppointment(), getType());
        super.getDescription();
    }
    public Massager(String model, String appointment, String type,
                    String massage_type, boolean infrared_heating, int number_of_modes, String manufacturer,
                             String colour, double weight, String material)
    {
        super(massage_type, infrared_heating, number_of_modes, manufacturer, colour, weight, material);
        Model=model;
        Appointment=appointment;
        Type=type;
    }
}
