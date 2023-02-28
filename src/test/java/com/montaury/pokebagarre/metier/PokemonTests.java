package com.montaury.pokebagarre.metier;

import com.montaury.pokebagarre.fixtures.ConstructeurDePokemon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTests {

    // Test Pokémon 1 gagne avec une attaque supérieure
    @Test
    void premier_pokemon_gagne(){
        // GIVEN
        ConstructeurDePokemon pokeFort = new ConstructeurDePokemon();
        ConstructeurDePokemon pokeNul = new ConstructeurDePokemon();

        pokeFort.avecAttaque(100);
        pokeFort.avecDefense(1);

        pokeNul.avecAttaque(20);
        pokeNul.avecDefense(5);

        // WHEN
        boolean resultat = pokeFort.construire().estVainqueurContre(pokeNul.construire());

        // THEN
        assertEquals(true, resultat);
    }

    // Test Pokémon 2 gagne avec une attaque supérieure
    @Test
    void deuxieme_pokemon_gagne(){
        // GIVEN
        ConstructeurDePokemon pokeFort = new ConstructeurDePokemon();
        ConstructeurDePokemon pokeNul = new ConstructeurDePokemon();

        pokeFort.avecAttaque(100);
        pokeFort.avecDefense(1);

        pokeNul.avecAttaque(20);
        pokeNul.avecDefense(5);

        // WHEN
        boolean resultat = pokeNul.construire().estVainqueurContre(pokeFort.construire());

        // THEN
        assertEquals(false, resultat);
    }

    //	Pokémon 1 et 2 ont une attaque identique et 1 gagne
    @Test
    void premier_pokemon_gagne_attaque_identique(){
        // GIVEN
        ConstructeurDePokemon pokeFort = new ConstructeurDePokemon();
        ConstructeurDePokemon pokeNul = new ConstructeurDePokemon();

        pokeFort.avecAttaque(100);
        pokeFort.avecDefense(10);

        pokeNul.avecAttaque(100);
        pokeNul.avecDefense(5);

        // WHEN
        boolean resultat = pokeFort.construire().estVainqueurContre(pokeNul.construire());

        // THEN
        assertEquals(true, resultat);
    }

    //	Pokémon 1 et 2 ont une attaque identique et 2 gagne
    @Test
    void deuxieme_pokemon_gagne_attaque_identique(){
        // GIVEN
        ConstructeurDePokemon pokeFort = new ConstructeurDePokemon();
        ConstructeurDePokemon pokeNul = new ConstructeurDePokemon();

        pokeFort.avecAttaque(100);
        pokeFort.avecDefense(10);

        pokeNul.avecAttaque(100);
        pokeNul.avecDefense(5);

        // WHEN
        boolean resultat = pokeNul.construire().estVainqueurContre(pokeFort.construire());

        // THEN
        assertEquals(false, resultat);
    }

    //	Pokémon 1 et 2 ont une attaque et défense identique
    @Test
    void pokemon_attaque_defense_identique(){
        // GIVEN
        ConstructeurDePokemon pokeFort = new ConstructeurDePokemon();
        ConstructeurDePokemon pokeNul = new ConstructeurDePokemon();

        pokeFort.avecAttaque(100);
        pokeFort.avecDefense(50);

        pokeNul.avecAttaque(100);
        pokeNul.avecDefense(50);

        // WHEN
        boolean resultat = pokeFort.construire().estVainqueurContre(pokeNul.construire());

        // THEN
        assertEquals(true, resultat);
    }



}