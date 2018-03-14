package rwilk.learnenglish.model;

import java.io.Serializable;

public class Word implements Serializable {

    private long idWord;
    private long idLesson;
    private String polishWord;
    private String englishWord;
    private String partOfSpeech;
    private String sentenceEN;
    private String sentencePL;
    private long progress;
    private long saved;
    private String info;

    public long getIdWord() {
        return idWord;
    }

    public void setIdWord(long idWord) {
        this.idWord = idWord;
    }

    public long getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(long idLesson) {
        this.idLesson = idLesson;
    }

    public String getPolishWord() {
        return polishWord;
    }

    public void setPolishWord(String polishWord) {
        this.polishWord = polishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getSentenceEN() {
        return sentenceEN;
    }

    public void setSentenceEN(String sentenceEN) {
        this.sentenceEN = sentenceEN;
    }

    public String getSentencePL() {
        return sentencePL;
    }

    public void setSentencePL(String sentencePL) {
        this.sentencePL = sentencePL;
    }

    public long getProgress() {
        return progress;
    }

    public void setProgress(long progress) {
        this.progress = progress;
    }

    public long getSaved() {
        return saved;
    }

    public void setSaved(long saved) {
        this.saved = saved;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
