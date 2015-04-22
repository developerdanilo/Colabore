package uea.edu.br.colabore;

import java.util.ArrayList;

/**
 * Created by Danilo Oliveira on 22/04/2015.
 */
public class Categoria {
    public final int id;
    public final String name;
    public final int drawableId;
    public ArrayList<Item> items;

    public Categoria(int id, String name, int drawableId, ArrayList<Item> items) {
        this.id = id;
        this.name = name;
        this.drawableId = drawableId;
        this.items = items;
    }

    public Categoria(int id, String name, int drawableId) {
        this.id = id;
        this.name = name;
        this.drawableId = drawableId;
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

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }
}
