package com.robosh;

import com.robosh.TextParts.Sentence;
import com.robosh.TextParts.Text;
import com.robosh.TextParts.Word;

import java.util.Comparator;

public class TextParser {
    private static final String END_OF_SENTENCE = "(?<=[.!?])";
    private static final String TWO_AND_MORE_SPACES = "[\\s]{2,}";
    private static final String SPACE = "(?<=[\\s])";

    public static String removeSpaces(String str) {
        return str.replaceAll(TWO_AND_MORE_SPACES, " ");
    }

    public static Text getText(String str) {
        str = removeSpaces(str);
        Sentence sentence = new Sentence();
        Text text = new Text();
        for (String rows : str.split(END_OF_SENTENCE)) {
            for (String part : rows.split(SPACE)) {
                sentence.add(new Word(part));
            }
            text.addSentence(sentence.getSentence());
            sentence.clear();
        }
        return text;
    }

    public static Text getSortedText(Text text) {
        Text temp;
        temp = text;
        temp.getText().sort(Comparator.comparingInt(s -> s.getSentenceList().size()));
        return temp;
    }
}
