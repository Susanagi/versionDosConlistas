package com.example.conociendobetania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.conociendobetania.adaptadores.AdaptadorHotel;
import com.example.conociendobetania.adaptadores.AdaptadorRestaurante;
import com.example.conociendobetania.moldes.MoldeHotel;
import com.example.conociendobetania.moldes.Molderestaurante;

import java.util.ArrayList;

public class Listarestaurante extends AppCompatActivity {
    ArrayList<Molderestaurante> listarestaurante = new ArrayList<>();

    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerView = findViewById((R.id.reciclerviewhotel));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarlistacondatos();
        AdaptadorRestaurante adaptadorRestaurante = new AdaptadorRestaurante(listarestaurante);
        recyclerView.setAdapter(adaptadorRestaurante);

    }

    public void llenarlistacondatos () {
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));
        listarestaurante.add(new Molderestaurante("manantiales", "120.000", "3242310182", R.drawable.restaurantee));








    }