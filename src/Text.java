class Text {

    private Text(String textString) {
        System.out.println("***Before***");
        System.out.println(textString);
        System.out.println("***After***");

        String[] splitString = textString.split("(?<=[?!.])");
        Sentence[] sentences = new Sentence[splitString.length];
        for (int i = 0; i < splitString.length; i++) {
            sentences[i] = new Sentence(splitString[i]);
        }
    }

    static void getAnswer(String text) {
        Text enter = new Text(text);
    }
}
