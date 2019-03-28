class Sentence {
    private static final String punctuationSymblos = ";:,.!?";

    Sentence(String s) {
        String[] splitString = s.split("(?=,|\\.|!|\\?)|\\s");

        Word[] words = new Word[splitString.length];
        Punctuation[] punctuations = new Punctuation[splitString.length];

        for (int i = 0; i < splitString.length; i++) {

            if (punctuationSymblos.contains(splitString[i])) {
                punctuations[i] = new Punctuation(splitString[i]);
            } else {
                words[i] = new Word(splitString[i]);
            }

        }
    }
}
