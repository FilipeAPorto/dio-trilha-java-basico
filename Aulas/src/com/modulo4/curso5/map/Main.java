package com.modulo4.curso5.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String , String> aluno = new HashMap<>();

        aluno.put("Nome","João");
        aluno.put("Idade","17");
        aluno.put("Media","8.5");
        aluno.put("Turma","3A");

        System.out.println(aluno);



        System.out.println(aluno.keySet());
        System.out.println(aluno.values());
    }
}
