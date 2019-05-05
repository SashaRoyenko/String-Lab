package com.robosh.TextParts;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Sentence {
    private List<TextPart> sentence;

    public Sentence() {
        sentence = new LinkedList<>();
    }

    public Sentence(Sentence sentence) {
        this.sentence = new LinkedList<>(sentence.getSentenceList());
    }


    public void add(TextPart word) {
        sentence.add(word);
    }

    public List<TextPart> getSentenceList() {
        return sentence;
    }

    public Sentence getSentence() {
        return new Sentence(this);
    }

    public void clear() {
        sentence.clear();
    }

    public String join() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextPart part : sentence) {
            stringBuilder.append(part);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextPart textPart : sentence) {
            stringBuilder.append(textPart);
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }
}
