package com.intercambiophoto.aplicacionandroi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.MyViewHolder>{
    private ArrayList<ListElement> dataSet;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
    TextView txtPhotocards;
    TextView txtventaPH;
    ImageView Imagen1;
    public MyViewHolder(View itemView) {
        super(itemView);
        this.txtPhotocards = (TextView) itemView.findViewById(R.id.txtPhotocards);
        this.txtventaPH = (TextView) itemView.findViewById(R.id.txtventaPH);
        this.Imagen1 = (ImageView) itemView.findViewById(R.id.Imagen1);
    }
}
    public void ListAdapter(ArrayList<ListElement> data) {
        this.dataSet = data;
    }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_elemental, parent, false);
            MyViewHolder myViewHolder = new MyViewHolder(view);
            return myViewHolder;
        }

    @Override
        public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
            TextView txtPhotocards = holder.txtPhotocards;
            TextView txtventaPH= holder.txtventaPH;
            ImageView imageView = holder.Imagen1;
            txtPhotocards.setText(dataSet.get(listPosition).getNombre());
            txtventaPH.setText(dataSet.get(listPosition).getDescripcion());
        }
        @Override
        public int getItemCount() {
        return dataSet.size();
        }
    }
