import  java.util.*;
public class Scrabble {

    HashMap<Character, Integer> valueMap = new HashMap<>(); {
        valueMap.put('a', 1);
        valueMap.put('b', 3);
        valueMap.put('c', 3);
        valueMap.put('d', 2);
        valueMap.put('e', 1);
        valueMap.put('f', 4);
        valueMap.put('g', 2);
        valueMap.put('h', 4);
        valueMap.put('i', 1);
        valueMap.put('j', 8);
        valueMap.put('k', 5);
        valueMap.put('l', 1);
        valueMap.put('m', 3);
        valueMap.put('n', 1);
        valueMap.put('o', 1);
        valueMap.put('p', 3);
        valueMap.put('q', 10);
        valueMap.put('r', 1);
        valueMap.put('s', 1);
        valueMap.put('t', 1);
        valueMap.put('u', 1);
        valueMap.put('v', 4);
        valueMap.put('w', 4);
        valueMap.put('x', 8);
        valueMap.put('y', 4);
        valueMap.put('z', 10);
    }

    public String word;
    //public char[] characters;
    public Integer score = 0;
    public List<Character> doubleLetter;
    public List<Character> tripleLetter;
    public boolean doubleWord;
    public boolean tripleWord;

    public Scrabble(String input) {
        this.word = input;
        this.doubleLetter = new ArrayList();
        this.tripleLetter = new ArrayList();
        this.doubleWord = false;
        this.tripleWord = false;
    }
    public Scrabble (String input, Character[] doubleLetter, Character[] tripleLetter, boolean doubleWord, boolean tripleWord) {
        this.word = input;
        this.doubleLetter = new ArrayList<>(Arrays.asList(doubleLetter));
        this.doubleLetter.replaceAll(Character::toLowerCase);
        this.tripleLetter = new ArrayList<>(Arrays.asList(tripleLetter));
        this.tripleLetter.replaceAll(Character::toLowerCase);
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
    }
    public int score() {
        if (wordCheck()) return 0;

        for (char c : this.word.toLowerCase().toCharArray()) score += getLetterScore(c);
        score = wordMultiplierCheck(score);
        return score;
    }

    public boolean wordCheck() {
        return (word == null || word.equals(""));
    }

    public int wordMultiplierCheck(int score) {
        if (doubleWord) score *= 2;
        if (tripleWord) score *= 3;
        return score;
    }

    public int getLetterScore(char c) {
        int letterScore = this.valueMap.get(Character.toLowerCase(c));

        if (doubleLetter.contains(c)) return doubleLetter(c, letterScore);
        if (tripleLetter.contains(c)) return tripleLetter(c, letterScore);
        return letterScore;
    }

    public int doubleLetter(char c, int letterScore) {
        doubleLetter.remove(Character.valueOf(c));
        return letterScore * 2;
    }

    public int tripleLetter(char c, int letterScore) {
        tripleLetter.remove(Character.valueOf(c));
        return letterScore * 3;
    }
}
