import java.util.Arrays;

public class Word extends SentenceMember {
    public Letter[] letters;

    public Word(String s) {
        letters = new Letter[s.length()];
        for (int i = 0; i < s.length(); i++) {
            letters[i] = new Letter(s.charAt(i));
            //System.out.println(letters[i].toString());
            //System.out.println(Arrays.asList(letters));


        }
    }
    public void sout(String s){

    }
}