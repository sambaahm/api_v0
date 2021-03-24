package fr.esiea.ex4A.matching;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MatchingControlle {
    @PostMapping(path = "api/inscription")
    void registerUser(@RequestBody User user){
        System.out.println(user);
    }

    @GetMapping(path = "api/matches", produces = MediaType.APPLICATION_JSON_VALUE)
    List<Matches> getMatches(String name, String country){

        return new MatchesRes(new Matches("sam", "samanatha"),
            new Matches("samira", "samu"),
            new Matches("samba", "samaha"));
    }


}
