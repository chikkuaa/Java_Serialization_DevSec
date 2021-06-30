import java.io.Serializable;
public class Item implements Serializable {

    int id;
    String name;
    public Item(int id, String name){
        this.id=id;
        this.name=name;
    }
}