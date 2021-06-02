package Abstract_Factory;

import Factory.AppliancesStore;
import Factory.SimpleAppliancesFactory;
import hierarchy.Appliances;

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
            item.getValue().DeliveryDescription();
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
        SimpleAppliancesFactory factory =new SimpleAppliancesFactory();
        AppliancesStore store =new AppliancesStore(factory);
        switch (key){
            case 1:
                objects.put("Плита", store.thisAppliance("Плита"));
                break;
            case 2:
                objects.put("Микроволновая печь", store.thisAppliance("Микроволновая печь"));
                break;
            case 3:
                objects.put("Электрочайник", store.thisAppliance("Электрочайник"));
                break;
            case 4:
                objects.put("Кофеварка", store.thisAppliance("Кофеварка"));
                break;
            case 5:
                objects.put("Фен", store.thisAppliance("Фен"));
                break;
            case 6:
                objects.put("Выпрямитель для волос", store.thisAppliance("Выпрямитель для волос"));
                break;
            case 7:
                objects.put("Массажер", store.thisAppliance("Массажер"));
                break;
            case 8:
                objects.put("Массажная ванночка", store.thisAppliance("Массажная ванночка"));
                break;
            default:
                break;
        }
    }
}
