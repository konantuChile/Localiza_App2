package com.example.konan.localiza_app.Clases;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.konan.localiza_app.R;

import java.util.ArrayList;

/**
 * Created by konan on 30/05/2017.
 */

public class AdapterCliente extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Clientes> items;

    public AdapterCliente() {
        this.activity = activity;
        this.items = items;
    }
    public AdapterCliente(Activity activity, ArrayList<Clientes> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_cliente, null);

        }

        Clientes dir;
        dir = items.get(position);

        TextView nombreClie = (TextView) v.findViewById(R.id.nombreClienteItem);
        nombreClie.setText(dir.getNombreCliente());

        TextView direccionClie = (TextView) v.findViewById(R.id.direccionClienteItem);
        direccionClie.setText(dir.getDireccionCliente());
/*
        ImageView imagen = (ImageView) v.findViewById(R.id.imageView4);
        imagen.setImageDrawable(dir.getImage());
*/
        return v;
    }
}