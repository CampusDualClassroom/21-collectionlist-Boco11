package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise {

    public static List<String> createArrayList() {
      List<String> elements = new ArrayList<>();
      elements.add("GKFFD");
        elements.add("TNANA");
        elements.add("MPMSL");
        elements.add("PSWME");
        elements.add("LZMLF");
        elements.add("JYEBV");
        elements.add("YELNT");
        elements.add("JSNKR");
        elements.add("JFESF");
        elements.add("TMJLL");
         return elements;
    }
    public static void printElementsAndIndex(List<String> customList) {
   for (int i=0; i < customList.size(); i++){
       System.out.println("Indice: " + i + " su valor es: " + customList.get(i));
   }
    }

    public static boolean addElementToList(List<String> customList, String element) {
     return customList.add(element);

    }

    public static void main(String[] args) {
        List<String> lista= createArrayList();     /// esto permiteme crear a lista xa co metodo dado que xa a creo arriba.
        addElementToList(lista,"AAAA");
        printElementsAndIndex(lista);
    }


}
