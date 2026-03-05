import java.util.Collection;
import java.util.List;
import java.util.Map;

public class MapListAdapter  implements InterfaceList,InterfaceMap{

    private Map<Integer, String> map;

    //Constructor
    public MapListAdapter(Map<Integer, String> map){
        this.map = map;
    }

    //Methods Interface
    @Override
    public void add(String value) {
        this.map.put(this.map.size(),value);
    }

    @Override
    public boolean contains(String value) {
        return this.map.containsValue(value);
    }

    @Override
    public String get(int index) {
        return (String)this.map.get(index);
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public boolean remove(String value) {
        Integer keyToRemove = null;
        for (Map.Entry<Integer, String> entry : this.map.entrySet()){
            if(((String)entry.getValue()).equals(value)) {
                keyToRemove = entry.getKey();
                break;
            }
        }
        if(keyToRemove != null){
            this.map.remove(keyToRemove);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public Object[] toArray() {
        return this.map.values().toArray();
    }

    @Override
    public void put(Integer key, String value) {
        this.map.put(key, value);
    }

    @Override
    public String get(Integer key) {
        return (String)this.map.get(key);
    }

    @Override
    public boolean containsKey(Integer key) {
        return this.map.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return this.map.containsValue(value);
    }

    @Override
    public void remove(Integer key) {
        this.map.remove(key);
    }

    @Override
    public Collection<String> values() {
        return this.map.values();
    }
}
