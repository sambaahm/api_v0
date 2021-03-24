package fr.esiea.ex4A.matching;
import fr.esiea.ex4A.matching.Matches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchesRes extends ArrayList<Matches> {


        public MatchesRes(List<Matches> matches){
            super();
            this.addAll(matches);
        }

        public MatchesRes(Matches... matches){
            super();
            this.addAll(Arrays.asList(matches));
        }
    }

