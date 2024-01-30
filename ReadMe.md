# Harmless Ransom Note

## Problem Statement

The "Harmless Ransom Note" problem involves determining whether a given ransom note can be constructed from the words available in a given magazine text. The note is composed by cutting out whole words from the magazine text. Each word in the magazine can only be used once in the ransom note. Note that the comparison is case-sensitive, which means 'Word' and 'word' would be considered different.

Your task is to write a function that will return `true` if the ransom note can be constructed from the magazine; otherwise, it returns `false`.

## Function Signature

```java
public boolean harmlessRansomNote(String ransomNote, String magazine): boolean
```

### Parameters

- `ransomNote`: A string representing the ransom note to be constructed.
- `magazine`: A string representing the text of the magazine.

### Return

- Returns `boolean`: `true` if the ransom note can be constructed from the magazine text, otherwise `false`.

## Examples

### Example 1:

**Input**: ransomNote = "this is a secret note for you from a secret admirer", magazine = "puerto rico is a great place you must hike far from town to find a secret waterfall that i am an admirer of but note that it is not as hard as it seems this is my advice for you"

**Output**: `false`

**Explanation**: The word "secret" is used twice in the ransom note but is found only once in the magazine text.

### Example 2:

**Input**: ransomNote = "this is a note for you from a secret admirer", magazine = "puerto rico is a great place you must hike far from town to find a secret waterfall that i am an admirer of but note that it is not as hard as it seems this is my advice for you"

**Output**: `true`

**Explanation**: All words in the ransom note can be found in the magazine text.



