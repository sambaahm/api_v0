package fr.esiea.ex4A.matching;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class TestMatchesRes{
    @ParameterizedTest
    @ValueSource(strings = {"""
        Nom1,Twitter1
        Macron,emmanuel
        Anissa ,Leblanc
        """, """
        Katy,Perri
        cristiano,Ronaldo
        Kylie,Jenner
        """
    })
    void matchesresponse_filling_list_test(String NomNTwitter){
        List<Matches> identifiants = Arrays.stream(NomNTwitter.split("\n")).map(s -> {
            String[] kv = s.split(",");
            return new Matches(kv[0],kv[1]);
        }).collect(Collectors.toList());

        MatchesRes matches = new MatchesRes(identifiants);

        matches.forEach(m -> assertTrue(identifiants.contains(m)));

    }
    @ParameterizedTest
    @CsvSource({
        "Katy,Perri,cristiano,Ronaldo,Kylie,Jenner"
    })
    void matchesresponse_mult_val_test(String Nom1, String Twitter1, String Nom2, String Twitter2, String Nom3, String Twitter3){
        List<Matches> identifiants = Arrays.asList(new Matches(Nom1, Twitter1),
            new Matches(Nom2, Twitter2),
            new Matches(Nom3, Twitter3));
        MatchesRes matches = new MatchesRes(identifiants.get(0),
            identifiants.get(1),
            identifiants.get(2));

        matches.forEach(m -> assertTrue(identifiants.contains(m)));
    }

    }

