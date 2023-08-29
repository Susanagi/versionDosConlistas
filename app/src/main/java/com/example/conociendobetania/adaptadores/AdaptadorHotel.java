package com.example.conociendobetania.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.conociendobetania.R;
import com.example.conociendobetania.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHotel extends  RecyclerView.Adapter<AdaptadorHotel.viewHolder>{

    public ArrayList<MoldeHotel> listaHoteles;

    public AdaptadorHotel() {
    }

    @NonNull
    @Override
    public AdaptadorHotel.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHotel.viewHolder holder, int position) {
    holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public AdaptadorHotel(ArrayList<MoldeHotel> listaHoteles) {
        listaHoteles = listaHoteles;
    }

    public static class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.fotolistahotel);
            nombreHotel=itemView.findViewById(R.id.nombrelistahotel);
            precioHotel=itemView.findViewById(R.id.preciolistahotel);
            contactoHotel=itemView.findViewById(R.id.numerolistahotel);   

        
        }

        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getContacto());
        }
    }
}
