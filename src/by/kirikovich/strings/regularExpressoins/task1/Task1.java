package by.kirikovich.strings.regularExpressoins.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    private void swap(int[] array, String[] paragraph, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;

        String tmp2 = paragraph[ind1];
        paragraph[ind1] = paragraph[ind2];
        paragraph[ind2] = tmp2;
    }

    private void swap(String[] paragraph, int ind1, int ind2) {
        String tmp2 = paragraph[ind1];
        paragraph[ind1] = paragraph[ind2];
        paragraph[ind2] = tmp2;
    }

    public void shellSort(int[] array, String[] paragraphs) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, paragraphs, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
    }

    public void sortParagraphs(String text) {
        Pattern pattern = Pattern.compile("\\t");
        String[] paragraphs = pattern.split(text);
        pattern = Pattern.compile("[\\.!?]");
        int[] array = new int[paragraphs.length];
        for (int i = 1; i < paragraphs.length; i++) {
            Matcher matcher = pattern.matcher(paragraphs[i]);
            while (matcher.find()) {
                array[i]++;
            }
        }
        shellSort(array, paragraphs);
        for (int i = 1; i < paragraphs.length; i++) {
            System.out.println("\t" + paragraphs[i] + "\n(" + array[i] + " предложения)\n");
        }
    }

    public void bubleSort(String[] word) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < word.length; i++) {
                if (word[i].length() < word[i - 1].length()) {
                    swap(word, i, i - 1);
                    needIteration = true;
                }
            }
        }
    }

    public void sortSentences(String text) {
        Pattern pattern = Pattern.compile("[A-Za-z, ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String sentence = text.substring(matcher.start(), matcher.end());
            Pattern pattern1 = Pattern.compile("[ ]");
            String[] words = pattern1.split(sentence);
            bubleSort(words);
            System.out.println(Arrays.toString(words));
        }
    }

    public int countOccurrences(String word, String symbol) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[" + symbol + "]");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static boolean compareWords(String firstWord, String secondWord) {
        boolean b = false;
        int length = 0;
        if (firstWord.length() < secondWord.length()) {
            length = firstWord.length();
        } else {
            length = secondWord.length();
        }
        for (int i = 0; i < length; i++) {
            if (firstWord.toLowerCase().charAt(i) > secondWord.toLowerCase().charAt(i)) {
                b = true;
                break;
            } else if (firstWord.toLowerCase().charAt(i) < secondWord.toLowerCase().charAt(i)) {
                break;
            }
        }
        return b;
    }

    public void bubleSort(int[] array, String[] word) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    swap(array, word, i, i - 1);
                    needIteration = true;
                } else if (array[i] == array[i - 1]) {
                    if (compareWords(word[i - 1], word[i])) {
                        swap(array, word, i, i - 1);
                    }
                }
            }
        }
    }

    public void sortTokens(String text, String symbol) {

        Pattern pattern = Pattern.compile("[A-Za-z, ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String sentence = text.substring(matcher.start(), matcher.end());
            Pattern pattern1 = Pattern.compile("[\\t .!?]+");
            String[] words = pattern1.split(sentence);
            int[] tmp = new int[words.length];
            for (int i = 0; i < words.length; i++) {
                tmp[i] = countOccurrences(words[i], symbol);
            }
            bubleSort(tmp, words);
            System.out.println(Arrays.toString(words));
        }
    }

    public void doYourJob() {
        Scanner readTemp = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = readTemp.nextLine();
        System.out.print("How do you want to sort this text:" +
                "\n1 - sort paragraphs by count of sentences" +
                "\n2 - sort sentences by words length" +
                "\n3 - sort tokens in a sentence in descending order of the number of occurrences of a given character" +
                "\nYour choice:  ");
        int number = readTemp.nextInt();
        switch (number) {
            case (1):
                sortParagraphs(text);
                break;
            case (2):
                sortSentences(text);
                break;
            case (3):
                System.out.print("Enter symbol:");
                String symbol = readTemp.nextLine();
                symbol = readTemp.nextLine();
                sortTokens(text, symbol);
                break;
            default:
                System.out.println("Choice incorrect");
        }
    }
}
