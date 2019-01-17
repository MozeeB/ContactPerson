package com.example.mozeeb.contactperson.model;

public class Contact {

    private String nama;
    private String email;
    private String alamat;
    private String noTlp;

    public Contact(String nama, String email, String alamat, String noTlp) {
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.noTlp = noTlp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
}
