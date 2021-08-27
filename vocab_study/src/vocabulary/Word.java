package vocabulary;

public abstract class Word {
    static final String[] langSupported = {"FRE", "KOR"};
    static int numberOfWords = 0;
    String wordInEnglish;
    String languageCode;
    String wordToLearn;
    int wrongAnswerCount;
    int hintCount;

    public Word(String wordInEnglish, String wordToLearn, String languageCode) {
        this.wordInEnglish = wordInEnglish;
        this.wordToLearn = wordToLearn;
        this.languageCode = languageCode;
        this.wrongAnswerCount = 0;
        this.hintCount = 0;
    }

    public Word(String wordInEnglish, String wordToLearn, int wrongAnswerCount, int hintCount) {
        this.wordInEnglish = wordInEnglish;
        this.wordToLearn = wordToLearn;
        this.wrongAnswerCount = wrongAnswerCount;
        this.hintCount = hintCount;
        numberOfWords++;
    }

    public void gotWrongAnswer() {
        this.wrongAnswerCount++;
    }

    public void usedHint() {
        this.hintCount++;
    }

    public void resetCount() {
        this.hintCount = 0;
        this.wrongAnswerCount = 0;
    }

    public boolean verifyInput(String input, String[] defaultInput) {
        for (String possibleInput : defaultInput) {
            if (input.equalsIgnoreCase(possibleInput)) {
                return true;
            }
        }
        return false;
    }

    public static int getNumberOfWords() {
        return numberOfWords;
    }

    public static void setNumberOfWords(int numberOfWords) {
        Word.numberOfWords = numberOfWords;
    }

    public String getWordInEnglish() {
        return wordInEnglish;
    }

    public void setWordInEnglish(String wordInEnglish) {
        this.wordInEnglish = wordInEnglish;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getWordToLearn() {
        return wordToLearn;
    }

    public void setWordToLearn(String wordToLearn) {
        this.wordToLearn = wordToLearn;
    }

    public int getWrongAnswerCount() {
        return wrongAnswerCount;
    }

    public void setWrongAnswerCount(int wrongAnswerCount) {
        this.wrongAnswerCount = wrongAnswerCount;
    }

    public int getHintCount() {
        return hintCount;
    }

    public void setHintCount(int hintCount) {
        this.hintCount = hintCount;
    }

    @Override
    public String toString() {
        return languageCode + "\n" + wordInEnglish + "\n" + wordToLearn + "\n" + wrongAnswerCount + "\n" + hintCount;
    }
}
