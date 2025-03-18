package TwoPointers;

public class ValidWordAbbreaviation {


    public static boolean validWordAbbreviation(String word, String abbr) {

        int w=0,a=0;
        int n = 0;
        while(a<abbr.length()){
            if(Character.isDigit(abbr.charAt(a))){
                System.out.println("digit:"+ abbr.charAt(a));
                while (a<abbr.length() && Character.isDigit(abbr.charAt(a))){
                    n=n*10 + Integer.parseInt(String.valueOf(abbr.charAt(a)));
                    if(n == 0)
                        return false;
                    a++;
                }

                if(w+n > word.length()){
                    return false;
                }else{
                    w=w+n;
                    n=0;
                }
            } else if(w >= word.length() || abbr.charAt(a) != word.charAt(w)){
                return false;
            }else{
                System.out.println("match found");
                a++;
                w++;
            }
        }
        if(w != word.length() ){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String[] words = {"a", "a", "abcdefghijklmnopqrst", "abcdefghijklmnopqrst", "word", "internationalization", "localization"};
        String[] abbreviations = {"a", "b", "a18t", "a19t", "w0rd", "i18n", "l12n"};

        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ".\t word: '" + words[i] + "'");
            System.out.println("\t abbr: '" + abbreviations[i] + "'");
            System.out.println("\n\t Is '" + abbreviations[i] + "' a valid abbreviation for the word '" + words[i] + "'? " + (validWordAbbreviation(words[i], abbreviations[i])? "Yes" : "No"));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
    }

}
