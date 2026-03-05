import java.util.List;
import java.util.Collection;

public class ListMapAdapter implements InterfaceMap{

    private List<String> list;

    //Constructor
    public ListMapAdapter(List<String> list){
        this.list = list;
    }

    //Methods Interface

    @Override
    public void put(Integer key, String value) {
        while(this.list.size() <= key){
            this.list.add(null);
        }
        this.list.set(key, value);
    }

    @Override
    public String get(Integer key) {
        return key < this.list.size() ? (String)this.list.get(key) : null;
    }

    @Override
    public boolean containsKey(Integer key) {
        return key < this.list.size() && this.list.get(key) != null;
    }

    @Override
    public boolean containsValue(String value) {
        return this.list.contains(value);
    }

    @Override
    public void remove(Integer key) {
        if (key < this.list.size()){
            this.list.set(key, null);
        }
    }

    @Override
    public void clear() {
        this.list.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public Collection<String> values() {
        return this.list;
    }
}
