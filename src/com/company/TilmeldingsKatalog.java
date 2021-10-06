package com.company;

import java.time.LocalDate;

public class TilmeldingsKatalog {
    String LejrID;
    boolean UgeRegel;
    LocalDate Startdato;
    LocalDate Slutdato;
    Person Deltagere[] ;

    public TilmeldingsKatalog() {
        LejrID="";
        UgeRegel=false;
        Startdato=LocalDate.now();
        Slutdato=LocalDate.now();
        Deltagere = new Person[10];

        for (int index = 0; index < Deltagere.length; index++)
        {
            Deltagere[index]=null;
        }
    }

    public TilmeldingsKatalog(String lejrID,
                              boolean ugeRegel,
                              LocalDate startdato,
                              LocalDate slutdato)
    {
        LejrID=lejrID;
        UgeRegel=ugeRegel;
        Startdato=startdato;
        Slutdato=slutdato;
        Deltagere = new Person[10];

        for (int index = 0; index < Deltagere.length; index++)
        {
            Deltagere[index]=null;
        }
    }

    public String toString()
    {
       String result=
                  "LejrID: " + LejrID
                + ", Ugeregel: " + UgeRegel
                + ", Startdato: " + Startdato
                + ", Slutdato: " + Slutdato;
       for(int idx = 0; idx < Deltagere.length; idx++)
       {
           if (Deltagere[idx] != null)
           {
               result = result + Deltagere[idx].toString() + "\n";
           }
       }
       return result;
    }
}


