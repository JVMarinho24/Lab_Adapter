import java.util.Collection;
import java.util.Map;

public class MapListAdapter  implements InterfaceList,InterfaceMap{

    private Map<Integer, String> map;


    public MapListAdapter(Map<Integer, String>){
        this.map = map;
    }

    //Metodos da Interface
    @Override
    public void add(String value) {
        map.put(map.size(),value);
    }

    @Override
    public boolean contains(String value) {
        return map.containsValue(value);
    }

    @Override
    public String get(int index) {
        return map.get(index);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(String value) {
        Integer keyToRemove = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            if(entry.getValue().equals(value)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if(keyToRemove != null){
            map.remove(keyToRemove);
            return true;
        }

        return false;
    }
}
