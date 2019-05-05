package com.robosh.TextParts;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Text {
    private final List<Sentence> text = new LinkedList<>();

    public void addSentence(Sentence sentence) {
        text.add(sentence);
    }

    public List<Sentence> getText() {
        return text;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Sentence sentence : text) {
            stringBuilder.append(sentence)
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
