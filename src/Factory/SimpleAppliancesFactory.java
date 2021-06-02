package Factory;
import Abstract_Factory.OmskDeliveryFactory;
import Abstract_Factory.TomskDeliveryFactory;
import hierarchy.*;

public class SimpleAppliancesFactory {
    public Appliances createAppliance(String type){
        Appliances appliances =null;
        if (type.equals("Плита")) {
            appliances=new Stove(new OmskDeliveryFactory(),"Мечта 15М", "электрическая плита",
                    false, 2,  "поворотный механизм",
                    false, "Россия","белый",
                    19, "эмаль", 7799, 24);
        } else if (type.equals("Микроволновая печь")){
            appliances=new Microwave(new TomskDeliveryFactory(),"DEXP MC-71", false,
                    false, "поворотный механизм",
                    true, "Китай", "черный",
                    11, "эмалированная сталь", 3199,12);
        } else if (type.equals("Электрочайник")){
            appliances=new Electric_kettle(new OmskDeliveryFactory(),"Irit IR-1320", false,
                    100, false, true,
                    false, "Китай", "серебристый",
                    0.835, "нержавеющая сталь",599,12);
        } else if (type.equals("Кофеварка")){
            appliances=new Coffee_maker(new TomskDeliveryFactory(),"ВАСИЛИСА КВ1-600", "кофеварка капельная",
                    "молотый", false, false,
                    false, "Китай", "красный",
                    1.1, "пластик", 1099, 12);
        } else if (type.equals("Фен")){
            appliances=new Hair_dryer(new OmskDeliveryFactory(),"Rowenta CV3320", true,
                    false, "нет", 3, "Китай", "белый",
                    0.45, "пластик", 1599, 24);
        } else if (type.equals("Выпрямитель для волос")){
            appliances=new Hair_straightener(new TomskDeliveryFactory(),"RIFF Щ1107",
                    "керамико-турмалиновое", true, 25,
                    "турмалиновая", 3, "Китай", "красный",
                    0.62, "пластик", 2950,6);
        } else if (type.equals("Массажер")){
            appliances=new Massager(new OmskDeliveryFactory(),"Bradex KZ 0311", "для тела",
                    "массажная подушка", "вибромассаж", false,
                    1, "Китай", "бежевый", 0.32,
                    "искусственная кожа", 550, 12);
        } else if (type.equals("Массажная ванночка")){
            appliances=new Massage_bath(new TomskDeliveryFactory(),"Beurer FB35",
                    true, false,
                    "вибромассаж, механический, пузырьковый, акупунктурный",
                    true, 2, "Китай",
                    "белый, розовый", 1.5, "пластик",5499,12);
        }
        return appliances;
    }
}
