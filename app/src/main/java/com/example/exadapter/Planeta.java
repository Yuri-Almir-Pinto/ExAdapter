package com.example.exadapter;

import java.util.ArrayList;
import java.util.List;

public class Planeta {
    public String nome;
    public String frase;
    public int img;

    public Planeta(String nome, String frase, int img) {
        this.nome = nome;
        this.frase = frase;
        this.img = img;
    }

    public static List<Planeta> getPlanetas() {
        List<Planeta> planetas = new ArrayList<Planeta>();

        planetas.add(new Planeta("Mercúrio", "O Mensageiro Ardente", R.drawable.planeta_01_mercurio));
        planetas.add(new Planeta("Venus", "A Estrela da Manhã", R.drawable.planeta_02_venus));
        planetas.add(new Planeta("Terra", "O Planeta Azul", R.drawable.planeta_03_terra));
        planetas.add(new Planeta("Marte", "O Planeta Vermelho", R.drawable.planeta_04_marte));
        planetas.add(new Planeta("Jupiter", "O Gigante Gasoso", R.drawable.planeta_05_jupiter));
        planetas.add(new Planeta("Saturno", "O Senhor dos Anéis", R.drawable.planeta_06_saturno));
        planetas.add(new Planeta("Urano", "O Planeta de Gelo Azul", R.drawable.planeta_07_urano));
        planetas.add(new Planeta("Netuno", "O Deus dos Mares", R.drawable.planeta_08_neptuno));

        return planetas;
    }
}
