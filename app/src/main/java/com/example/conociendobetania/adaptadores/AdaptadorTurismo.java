package com.example.conociendobetania.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conociendobetania.R;
import com.example.conociendobetania.moldes.MoldeSitios;

import java.util.ArrayList;

public class AdaptadorTurismo extends  RecyclerView.Adapter<AdaptadorTurismo.viewHolder>{
    public ArrayList<MoldeSitios> listaSitios;

    public AdaptadorTurismo() {
    }

    @NonNull
    @Override
    public AdaptadorTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldesitios,null,false);
        return new AdaptadorTurismo.viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTurismo.viewHolder holder, int position) {
        holder.actualizarDatos(listaSitios.get(position));
    }

    @Override
    public int getItemCount() {
        return listaSitios.size();
    }

    public AdaptadorTurismo(ArrayList<MoldeSitios> listaSitios) {
        listaSitios = listaSitios;
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotolistamachupichusitios;
        TextView Contactolistasitios;
        TextView Telefonolistasitios;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
               fotolistamachupichusitios =itemView.findViewById(R.id.fotolistamachupichusitios);
               Contactolistasitios =itemView.findViewById(R.id.Contactolistasitios);
               Telefonolistasitios =itemView.findViewById(R.id.Telefonolistasitios);
               //limitepreciolistasitios =itemView.findViewById(R.id.limitepreciolistasitios);

        }

        public void actualizarDatos(MoldeSitios moldeSitios) {
            fotolistamachupichusitios.setImageResource(moldeSitios.getFoto());
            Contactolistasitios.setText(moldeSitios.getNombre());

            Telefonolistasitios.setText(moldeSitios.getTelefono());
        }
    }
}
