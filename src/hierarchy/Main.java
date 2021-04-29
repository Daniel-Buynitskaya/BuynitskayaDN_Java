package hierarchy;
import java.util.*;

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
            case 1:
                    objects.put("Плита", new Stove("Мечта 15М", "электрическая плита",
                            false, 2,  "поворотный механизм",
                            false, "Россия","белый",
                            19, "эмаль", 7799, 24));

                break;
            case 2:
                    objects.put("Микроволновая печь", new Microwave("DEXP MC-71", false,
                            false, "поворотный механизм",
                            true, "Китай", "черный",
                            11, "эмалированная сталь", 3199,12));
                break;
            case 3:
                    objects.put("Электрочайник", new Electric_kettle("Irit IR-1320", false,
                            100, false, true,
                            false, "Китай", "серебристый",
                            0.835, "нержавеющая сталь",599,12));
                break;
            case 4:
                    objects.put("Кофеварка", new Coffee_maker("ВАСИЛИСА КВ1-600", "кофеварка капельная",
                            "молотый", false, false,
                            false, "Китай", "красный",
                            1.1, "пластик", 1099, 12));
                break;
            case 5:
                    objects.put("Фен", new Hair_dryer("Rowenta CV3320", true,
                            false, "нет", 3, "Китай", "белый",
                            0.45, "пластик", 1599, 24));
                break;
            case 6:
                    objects.put("Выпрямитель для волос", new Hair_straightener("RIFF Щ1107",
                            "керамико-турмалиновое", true, 25,
                            "турмалиновая", 3, "Китай", "красный",
                            0.62, "пластик", 2950,6));
                break;
            case 7:
                    objects.put("Массажер", new Massager("Bradex KZ 0311", "для тела",
                            "массажная подушка", "вибромассаж", false,
                            1, "Китай", "бежевый", 0.32,
                            "искусственная кожа", 550, 12));
                break;
            case 8:
                    objects.put("Массажная ванночка", new Massage_bath("Beurer FB35",
                            true, false,
                            "вибромассаж, механический, пузырьковый, акупунктурный",
                            true, 2, "Китай",
                            "белый, розовый", 1.5, "пластик",5499,12));
                break;
            default:
                break;
        }
    }
}

