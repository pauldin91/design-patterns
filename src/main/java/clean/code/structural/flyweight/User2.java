package clean.code.structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class User2 {
    static List<String> strings=new ArrayList<>();
    private int [] names;

    public User2(String fullname) {
        Function<String,Integer> getOrAdd = (String s) ->{
            int idx = strings.indexOf(fullname);
            if(idx!=-1)
            {
                return idx;
            }else
            {
                strings.add(fullname);
                return strings.size()-1;
            }
        };
        names = Arrays.stream(fullname.split(" "))
                .mapToInt(s->getOrAdd.apply(s))
                .toArray();
    }
}
