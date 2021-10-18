package lab3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Info {

    String text;
    int sentences;

    static void countSentencesAndWords(String text){
        int sentences=0, words=0;

        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)=='.') sentences++;
            if (text.charAt(i)==' ') words++;
            if (text.charAt(i)=='.' && i==text.length()-1) words++;
        }

        System.out.println("This text has " + sentences + " sentences and " + words + " words");

    }

    static void countLetters(String text){
        int letters=0, vowels=0, consonants=0;

        for (int i=0; i<text.length(); i++){
            if (text.charAt(i)!='.' && text.charAt(i)!=' ' && text.charAt(i)!=',') {
                letters++;
                if (text.charAt(i)=='a' || text.charAt(i)=='e' || text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u' || text.charAt(i)=='y')
                    vowels++;
                else consonants++;
            }
        }

        System.out.println("The text contains " + letters + " letters, " + vowels + " vowels and " + consonants + " consonants.");
    }

    static void countMax(String text){
        Map<String,Integer> m = new HashMap<String,Integer>();
        int first=0, last, longest=0;
        String longestString = new String();

        for (last=0; last<text.length()-1; last++) {
            if ((text.charAt(last)!='.' && text.charAt(last)!=' ' && text.charAt(last)!=',') && (text.charAt(last+1)=='.' || text.charAt(last+1)==' ' || text.charAt(last)==',')){
                String s = text.substring(first,last+1);
                if (s.length() > longest) {
                    longestString = String.valueOf(s);
                    longest = longestString.length();
                }
                if (m.containsKey(s)) {
                    int count = (int) m.get(s);
                    m.put(s,count+1);
                }
                else {
                    m.put(s, 1);
                }
            }
            else {
                if (last!=0 && text.charAt(last-1)==' ' && text.charAt(last)!=' '){
                    first = last;
                }
            }

        }

        System.out.println("The longest word is " + longestString);

        System.out.println("The 5 most often words in the text are:");
        int count=0;
        while (count<5){
            if (m.containsValue(longest)) {
                for ( String key : m.keySet() ) {
                    if (m.get(key) == longest) {
                        System.out.println( key );
                        count++;
                        m.put(key,-1);
                        break;
                    }
                }
            }
            else {
                longest--;
            }
        }

    }



}
