package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> lista = new ArrayList<String>();
        if (value != null) {
            for (int i = 0; i < value.length() + 1; i++) {
                lista.add(value.substring(i, value.length()));
            }

        }

        return lista;
    }

}
