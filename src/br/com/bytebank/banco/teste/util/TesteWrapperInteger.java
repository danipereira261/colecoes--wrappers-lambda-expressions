package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);//Autoboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue();//Unboxing

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(idadeRef);
        System.out.println(idadeRef);
     }
}
