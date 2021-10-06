package com.company;

import java.time.LocalDate;

public class Person {
    int Id;
    String Navn;
    String Adresse;
    String Patrulje;
    LocalDate FoedselsDato;
    boolean EnUge;



    public Person()
    {
        Id=0;
        Navn="";
        Adresse="";
        Patrulje="";
        FoedselsDato = LocalDate.now();
        EnUge = false;
    }

    public Person(int id,
                  String navn,
                  String adresse,
                  String patrulje,
                  LocalDate fDato,
                  boolean enUge  )
    {
        Id=id;
        Navn=navn;
        Adresse=adresse;
        Patrulje=patrulje;
        FoedselsDato = fDato;
        EnUge = enUge;
    }

    public String toString()
    {
        return      "Id: " + Id
                + ", Navn: " + Navn
                + ", Adresse: " + Adresse
                + ", Patrulje: " + Patrulje
                + ", Fødselsdato: " + FoedselsDato
                + ", EnUge: " + EnUge;
    }

    public int getID(){ return Id;}
    public String getNavn(){ return Navn;}
    public String getAdresse(){ return Adresse;}
    public String getPatrulje(){ return Patrulje;}
    public LocalDate getFoedselsDato(){ return FoedselsDato;}
    public boolean getEnUge(){ return EnUge;}

    public void setID(int value){ Id=value;}
    public void setNavn(String value){ Navn=value;}
    public void setAdresse(String value){Adresse=value;}
    public void setPatrulje(String value) {Patrulje=value;}
    public void setFoedselsDato(LocalDate value){FoedselsDato=value;}
    public void setEnUge(boolean value ){ EnUge=value;}

}
