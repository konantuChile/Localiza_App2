package com.example.konan.localiza_app.Clases;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.konan.localiza_app.R;
import com.example.konan.localiza_app.Visitas.GestionesActivity;

import java.util.ArrayList;

/**
 * Created by konan on 30/05/2017.
 */

public class AdapterGestion extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Gestiones> items;

    public AdapterGestion() {
        this.activity = activity;
        this.items = items;
    }

    public AdapterGestion(Activity activity, ArrayList<Gestiones> items) {
        this.activity = activity;
        this.items = items;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_gestiones, null);
        }

        Gestiones dir;
        dir = items.get(position);

        TextView nombreClie = (TextView) v.findViewById(R.id.nombreGestion);
        nombreClie.setText(dir.getNombreGestion());

        return v;
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
}
