package Decorator;
import hierarchy.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Appliances> objects=new HashMap<String, Appliances>();
    public static void main(String[] args) {
        objects.clear();
        int N=rnd(1,8);
        System.out.printf("N = %s \n", N);
        int[] unique=new int [N];
        for (int i = 0; i < N; i++) {
            unique[i] = i+1;
        }
        for (int i=0; i<N; i++)
        {
            object(unique[i]);
        }
        for (Map.Entry<String, Appliances> item : objects.entrySet())
        {
            System.out.print(item.getKey()+"\n\n");
            item.getValue().getDescription();
            System.out.print("\n\n");
        }
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
    public static void object(int key)
    {
        switch (key){
            case 1: {
                Appliances stove = new Stove("Мечта 15М", "электрическая плита",
                        false, 2, "поворотный механизм",
                        false, "Россия", "белый",
                        19, "эмаль", 7799, 24);
                stove=new Sale(stove, 20);
                objects.put("Плита", stove);
            }

                break;
            case 2: {
                Appliances microwave = new Microwave("DEXP MC-71", false,
                        false, "поворотный механизм",
                        true, "Китай", "черный",
                        11, "эмалированная сталь", 3199, 12);
                microwave=new Add_guarantee(microwave,12,416);
                objects.put("Микроволновая печь", microwave);
            }
                break;
            case 3: {
                Appliances electric_kettle = new Electric_kettle("Irit IR-1320", false,
                        100, false, true,
                        false, "Китай", "серебристый",
                        0.835, "нержавеющая сталь", 599, 12);
                electric_kettle=new Add_comment(electric_kettle,4,"Не советую покупать из-за возможной проблемы с выключением.");
                objects.put("Электрочайник", electric_kettle);
            }
                break;
            case 4: {
                Appliances coffee_maker = new Coffee_maker("ВАСИЛИСА КВ1-600", "кофеварка капельная",
                        "молотый", false, false,
                        false, "Китай", "красный",
                        1.1, "пластик", 1099, 12);
                coffee_maker=new Sale(coffee_maker, 10);
                coffee_maker=new Add_guarantee(coffee_maker, 12, 200);
                objects.put("Кофеварка", coffee_maker);
            }
                break;
            case 5: {
                Appliances hair_dryer=new Hair_dryer("Rowenta CV3320", true,
                        false, "нет", 3, "Китай", "белый",
                        0.45, "пластик", 1599, 24);
                hair_dryer=new Add_guarantee(hair_dryer,12,208);
                hair_dryer=new Sale(hair_dryer,20);
                objects.put("Фен", hair_dryer);
            }
                break;
            case 6: {
                Appliances hair_straightener=new Hair_straightener("RIFF Щ1107",
                        "керамико-турмалиновое", true, 25,
                        "турмалиновая", 3, "Китай", "красный",
                        0.62, "пластик", 2950, 6);
                hair_straightener=new Sale(hair_straightener, 5);
                hair_straightener=new Sale(hair_straightener, 15);
                hair_straightener=new Add_guarantee(hair_straightener,12, 384);
                hair_straightener= new Add_comment(hair_straightener,4,"Хорошее качество");
                objects.put("Выпрямитель для волос", hair_straightener);
            }
                break;
            case 7: {
                Appliances massager=new Massager("Bradex KZ 0311", "для тела",
                        "массажная подушка", "вибромассаж", false,
                        1, "Китай", "бежевый", 0.32,
                        "искусственная кожа", 550, 12);
                massager=new Add_guarantee(massager, 12,200);
                massager=new Add_comment(massager, 4, "Брал взамен перфоратора чтобы мстить соседям! очень советую!");
                objects.put("Массажер", massager);
            }
                break;
            case 8: {
                Appliances massage_bath=new Massage_bath("Beurer FB35",
                        true, false,
                        "вибромассаж, механический, пузырьковый, акупунктурный",
                        true, 2, "Китай",
                        "белый, розовый", 1.5, "пластик", 5499, 12);
                massage_bath=new Add_guarantee(massage_bath,12,715);
                massage_bath=new Sale(massage_bath,10);
                massage_bath=new Add_comment(massage_bath, 5,"Если бы эта шайтан-машина могла поддерживать температуру градусов 42-45 - была бы бесценна.");
                objects.put("Массажная ванночка", massage_bath);
            }
                break;
            default:
                break;
        }
    }
}
