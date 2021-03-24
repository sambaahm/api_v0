package fr.esiea.ex4A.matching;
import fr.esiea.ex4A.matching.Matches;
import fr.esiea.ex4A.matching.User;
import fr.esiea.ex4A.matching.MatchesRes;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
