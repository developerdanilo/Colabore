package uea.edu.br.colabore;

/**
 * Created by Danilo Oliveira on 22/04/2015.
 */
public class Item {
    public final int id;
    public final String name;
    public final int drawableId;

    public Item(int id, String name, int drawableId) {
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
}
