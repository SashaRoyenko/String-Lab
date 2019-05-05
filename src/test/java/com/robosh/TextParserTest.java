package com.robosh;

import com.robosh.TextParts.Sentence;
import com.robosh.TextParts.Text;
import com.robosh.TextParts.Word;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TextParserTest {
    private String str;
    private Sentence firstRow = new Sentence();
    private Sentence secondRow = new Sentence();
    private Sentence thirdRow = new Sentence();

    @Before
    public void setParameters() {
        str = "one,    two,     three." +
                "one,     two!" +
                "one.";
        firstRow.add(new Word("one, "));
        firstRow.add(new Word("two, "));
        firstRow.add(new Word("three."));

        secondRow.add(new Word("one, "));
        secondRow.add(new Word("two!"));

        thirdRow.add(new Word("one."));
    }

    @Test
    public void shouldRemoveSpaces() {
        String result = "one, two, three." +
                "one, two!" +
                "one.";
        assertEquals(TextParser.removeSpaces(str), result);
    }

    @Test
    public void shouldReturnTextClass() {
        Text result = new Text();
        result.addSentence(firstRow);
        result.addSentence(secondRow);
        result.addSentence(thirdRow);
        assertEquals(TextParser.getText(str), result);
    }

    @Test
    public void shouldReturnSortedText() {
        Text text = new Text();
        text.addSentence(firstRow);
        text.addSentence(secondRow);
        text.addSentence(thirdRow);

        Text result = new Text();
        result.addSentence(thirdRow);
        result.addSentence(secondRow);
        result.addSentence(firstRow);

        assertEquals(TextParser.getSortedText(text), result);
    }
}