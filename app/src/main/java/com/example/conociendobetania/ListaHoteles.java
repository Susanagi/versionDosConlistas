package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {
ArrayList<MoldeHotel> listahoteles = new ArrayList<>();

RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById((R.id.reciclerviewhotel));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarlistacondatos();
        AdaptadorHotel adaptadorHotel = new AdaptadorHotel(listahoteles);
        recyclerView.setAdapter(adaptadorHotel);

    }

    public void llenarlistacondatos () {
        listahoteles.add(new MoldeHotel("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listahoteles.add(new MoldeHotel("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listahoteles.add(new MoldeHotel("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listahoteles.add(new MoldeHotel("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listahoteles.add(new MoldeHotel("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
    }

}