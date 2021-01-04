package INTERMEDIATE.Others.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile("[\\s]*[a-zA-Z]+[a-zA-Z\\s]*");
//        Matcher matcher = pattern.matcher("  ");

        String regexPattern = "[\\s]*[a-zA-Z]+[a-zA-Z\\s]*";

        System.out.println(Pattern.matches(regexPattern," "));
        System.out.println(Pattern.matches(regexPattern,"      A"));
        System.out.println(Pattern.matches(regexPattern,"         "));
        System.out.println(Pattern.matches(regexPattern,"a  s s s"));
        System.out.println(Pattern.matches(regexPattern,"asdasd"));
        System.out.println(Pattern.matches(regexPattern,"1"));
        System.out.println(Pattern.matches(regexPattern," a a a "));

//        System.out.println(Pattern.matches("\\d","d"));
//        System.out.println(Pattern.matches("\\d","1"));
//        System.out.println(Pattern.matches("\\d","12"));
//        System.out.println(Pattern.matches("\\d","1d"));
    }
}
