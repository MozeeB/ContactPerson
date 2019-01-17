package com.example.mozeeb.contactperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mozeeb.contactperson.adapter.ContactAdapter;
import com.example.mozeeb.contactperson.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContactAdapter contactAdapter;
    private ArrayList<Contact> contactArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        contactAdapter = new ContactAdapter(contactArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(contactAdapter);

    }

    private void addData() {
        contactArrayList = new ArrayList<>();

        contactArrayList.add(new Contact("Mujiburrohman","Mujiburr741@gmail.com","Kelet - Jepara","085225678098"));
        contactArrayList.add(new Contact("M.Barra Fidaus", "Mbarra123@gmail.com","Kalimantan - Tengah", "08122567898"));
        contactArrayList.add(new Contact("Farras Haidar","Farrashai123@gmail.com","Bekasi - Timur","083476675565"));
        contactArrayList.add(new Contact("Roshihul Ulum","Roshihulum123@gmail.com","Bekasi - Jawa Barat", "085665728367"));
        contactArrayList.add(new Contact("Farel Vidandry", "farelVin123@gmail.com", "Depok - Jawa Barat", "082332434554"));
        contactArrayList.add(new Contact("Yazid MF", "Yazidganss123@gmail.com", "Bekasi - Jawa Barat", "089726763565"));
        contactArrayList.add(new Contact("Fathan Auzan", "Fhatanauz123@gmail.com", "Bekasi - Jawa Barat", "0818276762767"));
        contactArrayList.add(new Contact("Adni Tilla Gumilang", "Adnitilla123@gmail.com", "Batam - Indonesia", "087625652828"));

    }
}
