package Chap02_UsingRegularExpressions;

/**
 *
 * @author Neo
 */
public class P520_ValidDroidName {

    
    public static void main(String[] args) {

        String regex = "(\\w\\d-\\w\\d)|(\\w-\\d\\w\\w)";
        return droid.matches(regex);
    }

    String s = "One:Two;Three|Four\tFive";
    String regex = "[:;|\\t]";
    String strings[] = s.split(regex);
    for (String word : strings)
    System.out.println (word);
}
}

