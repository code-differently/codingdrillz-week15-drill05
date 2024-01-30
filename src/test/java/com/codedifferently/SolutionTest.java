package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private Solution solution;
    private String magazineText;

    @BeforeEach
    void setup() {
        solution = new Solution();
        magazineText = "puerto rico is a great place you must hike far from town to find a secret waterfall that i am an admirer of but note that it is not as hard as it seems this is my advice for you";
    }

    @Test
    void whenEmptyNote_thenReturnTrue() {
        String noteText = "";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertTrue(actual, "Empty note should always be constructable");
    }

    @Test
    void whenEmptyMagazineText_thenReturnFalse() {
        String noteText = "this is a note";
        magazineText = "";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertFalse(actual, "Cannot construct a note from empty magazine text");
    }

    @Test
    void whenNoteHasWordNotInMagazine_thenReturnFalse() {
        String noteText = "this is a unique note";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertFalse(actual, "Note contains 'unique' which is not in the magazine text");
    }

    @Test
    void whenNoteMatchesMagazineExactly_thenReturnTrue() {
        String noteText = "puerto rico is a great place";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertTrue(actual, "Note exactly matches a part of the magazine text");
    }

    @Test
    void whenNoteIsSubsetOfMagazine_thenReturnTrue() {
        String noteText = "a secret admirer";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertTrue(actual, "Note is a subset of the magazine text");
    }

    @Test
    void whenNoteHasAllWordsButWithDifferentCase_thenReturnFalse() {
        String noteText = "This Is A Note";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertFalse(actual, "Case sensitivity should result in a mismatch");
    }

    @Test
    void whenNoteHasRepeatingWordsNotInMagazine_thenReturnFalse() {
        String noteText = "this is is is is a note";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertFalse(actual, "Magazine text does not have enough 'is' for the note");
    }

    @Test
    void whenNoteHasPunctuation_thenReturnFalse() {
        String noteText = "this is a note.";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertFalse(actual, "Magazine text does not have 'note.' with a period");
    }

    @Test
    void whenMagazineTextIsSingleWord_thenReturnCorrectResult() {
        String noteText = "admirer";
        magazineText = "admirer";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertTrue(actual, "Single word note matches single word magazine text");
    }

    @Test
    void whenNoteAndMagazineTextAreBothEmpty_thenReturnTrue() {
        String noteText = "";
        magazineText = "";
        boolean actual = solution.harmlessRansomNote(noteText, magazineText);
        assertTrue(actual, "An empty note can be constructed from an empty magazine text");
    }
}
