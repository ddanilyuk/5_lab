class Word {
    static Letter[] letters;
    private static int check = 0;

    Word(String word){
        if (check != 0){
            System.out.print(" ");
        }

        check = 1;

        letters = new Letter[word.length()];
        for (int i =0; i < word.length(); i++){
            letters[i] = new Letter(word.charAt(i));
        }
    }
}
