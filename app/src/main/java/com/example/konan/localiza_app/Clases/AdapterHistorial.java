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
 * Created by konan on 13/06/2017.
 */

public class AdapterHistorial  extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Historial> items;

    public AdapterHistorial() {
        this.activity = activity;
        this.items = items;
    }

    public AdapterHistorial(Activity activity, ArrayList<Historial> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_gestiones_hist, null);
        }

        Historial dir;
        dir = items.get(position);

        TextView fechaGestHist = (TextView) v.findViewById(R.id.fechaGestionesHist);
        fechaGestHist.setText(dir.getFechaGestion());

        TextView resulatdoGestHist = (TextView) v.findViewById(R.id.resultadoGestionesHist);
        resulatdoGestHist.setText(dir.getResultadoGestion());

        TextView nombreGestHist = (TextView) v.findViewById(R.id.nombreGestionHist);
        nombreGestHist.setText(dir.getNombreGestion());

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


