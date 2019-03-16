import java.util.Arrays;

public class Sentence {
    private static final String PUNCTUATION_SYMBOLS = ",.!?";
    private SentenceMember[] sentenceMembers;

    public Sentence(String s) {
        String[] split = s.split("(?=,|\\.|!|\\?)|\\s");
        //System.out.println(Arrays.toString(split));
        sentenceMembers = new SentenceMember[split.length];
        for (int i = 0; i < split.length; i++) {
            if (PUNCTUATION_SYMBOLS.contains(split[i])) {
                sentenceMembers[i] = new Punctuation(split[i]);
                System.out.println(split[i]);
            } else {
                sentenceMembers[i] = new Word(split[i]);
                System.out.println(split[i]);

            }
        }
    }
}