import java.util.Collection;

public interface InterfaceMap {

    public void put(Integer key, String value);

    public String get(Integer key);

    public boolean containsKey(Integer Key);

    public boolean containsValue(String value);

    public void remove(Integer Key);

    public void clear();

    public boolean isEmpty();

    public int size();

    public Collection<String> values();
}
