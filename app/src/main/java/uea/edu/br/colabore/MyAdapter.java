package uea.edu.br.colabore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Danilo Oliveira on 22/04/2015.
 */
public class MyAdapter extends BaseAdapter {
    private final ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    private LayoutInflater inflater;


    public MyAdapter(Context context){
        inflater = LayoutInflater.from(context);

        categorias.add(new Categoria(1,"image 1",R.drawable.nature1));
        categorias.get(0).addItem(new Item(1,"imagem 3",R.drawable.tree1));
        categorias.get(0).addItem(new Item(2,"imagem 4",R.drawable.nature3));

        categorias.add(new Categoria(2,"image 1",R.drawable.nature2));
        categorias.get(1).addItem(new Item(1,"imagem 3",R.drawable.tree1));
        categorias.get(1).addItem(new Item(2,"imagem 4",R.drawable.nature3));
    }

    @Override
    public int getCount() {
        return categorias.size();
    }

    @Override
    public Object getItem(int position) {
        return categorias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return categorias.get(position).drawableId;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View v = view;
        ImageView picture;
        TextView name;

        if (v == null) {
            v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
            v.setTag(R.id.picture, v.findViewById(R.id.picture));
            v.setTag(R.id.text, v.findViewById(R.id.text));
            v.setPadding(8, 8, 8, 8);
        }

        picture = (ImageView)v.getTag(R.id.picture);
        name = (TextView)v.getTag(R.id.text);

        Categoria categoria = (Categoria)getItem(position);
        picture.setImageResource(categoria.drawableId);
        name.setText(categoria.name);

        return v;
    }

}
