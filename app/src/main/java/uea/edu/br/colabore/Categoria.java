package uea.edu.br.colabore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danilo Oliveira on 22/04/2015.
 */
public class Categoria {
    public final int id;
    public final String name;
    public final int drawableId;
    List<Item> items;

    public Categoria(int id, String name, int drawableId) {
        this.id = id;
        this.name = name;
        this.drawableId = drawableId;
    }

    public Categoria(int id, String name, int drawableId, List<Item> items) {
        this.id = id;
        this.name = name;
        this.drawableId = drawableId;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }
}
