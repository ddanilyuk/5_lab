public class Letter {
    private char symbol;

    Letter(char symbol) {
        this.symbol = symbol;
        if (!equals(Word.letters[0])) {
            System.out.print(symbol);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return Character.toLowerCase(((Letter) obj).symbol) == Character.toLowerCase(symbol);
        }
        return false;
    }
}