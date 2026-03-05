import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("---- MapListAdapter (Map -> List) ----");
        InterfaceList listFromMap = new MapListAdapter(new HashMap());
        listFromMap.add("Maçã");
        listFromMap.add("Banana");
        listFromMap.add("Laranja");
        System.out.println("Tamanho da lista: " + listFromMap.size());
        System.out.println("Contém 'Banana'? " + listFromMap.contains("Banana"));
        System.out.println("Elemento na posição 1: " + listFromMap.get(1));
        listFromMap.remove("Maçã");
        System.out.println("Após remover 'Maçã': ");

        Object[] var5;
        for(Object o : var5 = listFromMap.toArray()) {
            System.out.println(o);
        }

        System.out.println("\n---- ListToMapAdapter (List -> Map) ----");
        InterfaceMap mapFromList = new ListMapAdapter(new ArrayList());
        mapFromList.put(0, "Rio");
        mapFromList.put(2, "São Paulo");
        mapFromList.put(1, "Belo Horizonte");
        System.out.println("Tamanho do map: " + mapFromList.size());
        System.out.println("Valor da chave 1: " + mapFromList.get(1));
        System.out.println("Contém chave 2? " + mapFromList.containsKey(2));
        mapFromList.remove(0);
        System.out.println("Após remover chave 0:");

        for(String s : mapFromList.values()) {
            System.out.println(s);
        }
    }
}