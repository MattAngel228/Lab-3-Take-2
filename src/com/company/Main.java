package com.company;

public class Main {
    public static void main(String[] args) {
        String input = WebScrapper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        int wordCount = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == ' ' && input.charAt(i-1) != ' ') {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
}
