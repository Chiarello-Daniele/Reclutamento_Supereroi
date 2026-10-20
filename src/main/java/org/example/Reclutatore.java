package org.example;

import net.datafaker.Faker;

public class Reclutatore {
    private Faker faker = new Faker();

    public String recluta(int difficolta) throws EroeNonIdoneoException {
        String nome = faker.superhero().name();
        int livello = faker.number().numberBetween(1, 101);

        if (livello < difficolta) {
            throw new EroeNonIdoneoException(nome, livello);
        }
        return nome + " (livello " + livello + ")";
    }
}