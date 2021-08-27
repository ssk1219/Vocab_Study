package vocabulary;

public class Korean extends Word{
    String pronunciation;

    public Korean(String wordInEnglish, String wordToLearn, int wrongAnswer, int hintCount, String pronunciation) {
        super(wordInEnglish, wordToLearn, wrongAnswer, hintCount);
        this.languageCode = "KOR";
        this.pronunciation = pronunciation;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + pronunciation;
    }
}
