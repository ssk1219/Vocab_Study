package vocabulary;

import java.util.Arrays;

public class French extends Word {
    final String[] possibleGender = {"F", "M", "N"};
    final String[] possibleArticle = {"UN", "UNE", "DES"};
    String frGender;
    String frArticle;

    public French (String wordInEnglish, String wordToLearn, int wrongAnswer, int hintCount, String frGender, String frArticle) {
        super(wordInEnglish, wordToLearn, wrongAnswer, hintCount);
        this.languageCode = "FRE";
        this.frGender = frGender;
        this.frArticle = frArticle;
    }

    public String getFrGender() {
        return frGender;
    }

    public void setFrGender(String frGender) {
        this.frGender = frGender;
    }

    public String getFrArticle() {
        return frArticle;
    }

    public void setFrArticle(String frArticle) {
        this.frArticle = frArticle;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + frArticle + "\n" + frGender;
    }
}
