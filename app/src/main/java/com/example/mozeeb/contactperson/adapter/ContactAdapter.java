package com.example.mozeeb.contactperson.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mozeeb.contactperson.R;
import com.example.mozeeb.contactperson.model.Contact;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private ArrayList<Contact> dataList;

    public ContactAdapter(ArrayList<Contact> dataList) {
        this.dataList = dataList;
    }


    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.design_list, viewGroup, false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder contactViewHolder, int i) {
        contactViewHolder.nama.setText(dataList.get(i).getNama());
        contactViewHolder.email.setText(dataList.get(i).getEmail());
        contactViewHolder.alamat.setText(dataList.get(i).getAlamat());
        contactViewHolder.noTlp.setText(dataList.get(i).getNoTlp());

    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder{
        private TextView nama, email, alamat, noTlp;

        public ContactViewHolder(View itemView){
            super(itemView);
            nama = (TextView)itemView.findViewById(R.id.nama);
            email = (TextView)itemView.findViewById(R.id.email);
            alamat = (TextView)itemView.findViewById(R.id.alamat);
            noTlp = (TextView)itemView.findViewById(R.id.notlp);

        }
    }
}
