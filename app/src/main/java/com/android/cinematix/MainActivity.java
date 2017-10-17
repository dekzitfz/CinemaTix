package com.android.cinematix;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //TODO (1) buat variabel Widget UI

    //data source
    private List<String> classCinematix;
    private List<String> filmCinematix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO (2) definisikan masing-masing widget sesuai dengan layout xml

        /*
        spClass.setOnItemSelectedListener(this);
        spFilm.setOnItemSelectedListener(this);*/

        // Spinner Dropdown elements
        classCinematix = new ArrayList<String>();
        classCinematix.add("Ekonomi");
        classCinematix.add("Regular");
        classCinematix.add("Eksekutif");

        filmCinematix = new ArrayList<String>();
        filmCinematix.add("Emoji");
        filmCinematix.add("Star Wars: The last Jedi");
        filmCinematix.add("Rumah Pengabdi Setan?");
        filmCinematix.add("Interstellar");
        filmCinematix.add("Blade Runner 2049");
        filmCinematix.add("Thor: Ragnarok");
        filmCinematix.add("Pokemon: I Choose You");
        filmCinematix.add("Happy Death Day");
        filmCinematix.add("IT!");
        filmCinematix.add("Guardians Of Galaxy. Volume 2");


        // Creating adapter for spinner
        ArrayAdapter<String> classCinematixAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, classCinematix);
        ArrayAdapter<String> filmCinematixAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, filmCinematix);

        // Drop down layout style - list view with radio button
        /*classCinematixAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        filmCinematixAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);*/

        // Attaching data adapter to spinner
        /*spClass.setAdapter(classCinematixAdapter);
        spFilm.setAdapter(filmCinematixAdapter);*/

        //TODO (3) validasi inputan data saat tombol "PESAN TIKET" di klik
        //TODO (4) kirim data yang sudah valid ke UI (Activity) berikutnya dengan menggunakan intent

    }
}
