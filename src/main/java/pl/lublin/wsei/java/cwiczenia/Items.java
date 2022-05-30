package pl.lublin.wsei.java.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public Infografika(String text){
        System.out.println("TEKST:" + text);

    }
    public Infografika(String text, int dupa){
        System.out.println("TEKST:" + text + dupa);

    }

    public void getItems(String data, String pattern){
        data = data.replace("\t", "");
        data = data.replace("\n", "");
//        Pattern compiledPattern = Pattern.compile(pattern,Pattern.LITERAL);
//        Matcher matcher = compiledPattern.matcher(data);
//        System.out.println(pattern);
//        System.out.println(data);
//        System.out.println(matcher.find());
//        System.out.println(matcher.matches());

        List<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile(pattern)
                .matcher(data);
        while (m.find()) {
            allMatches.add(m.group());
            System.out.println(m.group());
        }
        System.out.println(allMatches.size());
    }
}
